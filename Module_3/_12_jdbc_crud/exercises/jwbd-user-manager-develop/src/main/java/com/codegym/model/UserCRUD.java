package com.codegym.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserCRUD {
    private String jdbcURL = "jdbc:mysql://localhost:3306/user";
    private String jdbcUsername = "root";
    private String jdbcPassword = "123456";

    private static final String INSERT_USERS_SQL = "insert into user (name, email, country) values (?, ?, ?);";
    private static final String SELECT_ALL_USERS = "select * from user;";
    private static final String SORT_BY_NAME_SQL = "select * from user order by name desc;";
    private static final String DELETE_USERS_SQL = "delete from user where id = ?;";
    private static final String UPDATE_USERS_SQL = "update user set name = ?, email = ?, country = ? where id = ?;";

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public List<User> find(String text) {
        List<User> new_list = new ArrayList<>();
        for (User user : selectAllUsers())
            if (user.getCountry().toLowerCase().contains(text.toLowerCase())) new_list.add(user);
        return new_list;
    }

    public List<User> selectAllUsers() {
        return select(SELECT_ALL_USERS);
    }

    public List<User> sortByName() {
        return select(SORT_BY_NAME_SQL);
    }

    private List<User> select(String sql) {
        List<User> userList = new ArrayList<>();
        try (PreparedStatement preparedStatement = getConnection().prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                userList.add(new User(id, name, email, country));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return userList;
    }

    public void saveUser(User user) {
        try (PreparedStatement preparedStatement = getConnection().prepareStatement(user.getId() > 0 ? UPDATE_USERS_SQL : INSERT_USERS_SQL)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            if (user.getId() > 0) preparedStatement.setInt(4, user.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    public void deleteUser(int id) throws SQLException {
        try (PreparedStatement preparedStatement = getConnection().prepareStatement(DELETE_USERS_SQL)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        }
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

//    public User selectUser(int id) {
//        User user = null;
//        try (PreparedStatement preparedStatement = getConnection().prepareStatement(SELECT_USER_BY_ID)) {
//
//            preparedStatement.setInt(1, id);
//            ResultSet resultSet = preparedStatement.executeQuery();
//
//            while (resultSet.next()) {
//                String name = resultSet.getString("name");
//                String email = resultSet.getString("email");
//                String country = resultSet.getString("country");
//                user = new User(id, name, email, country);
//            }
//        } catch (SQLException e) {
//            printSQLException(e);
//        }
//        return user;
//    }

//    public void updateUser(User user) {
//        try (PreparedStatement preparedStatement = getConnection().prepareStatement(UPDATE_USERS_SQL)) {
//            preparedStatement.setString(1, user.getName());
//            preparedStatement.setString(2, user.getEmail());
//            preparedStatement.setString(3, user.getCountry());
//            preparedStatement.setInt(4, user.getId());
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }

}