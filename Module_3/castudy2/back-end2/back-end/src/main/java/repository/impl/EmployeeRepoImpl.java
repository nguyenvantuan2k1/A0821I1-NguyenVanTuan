package repository.impl;

import model.entity.Employee;
import repository.BaseRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeRepoImpl implements BaseRepository<Employee> {
    private static final String SELECT_EMPLOYEE_ID = "select * from nhan_vien where id= ?";
    private static final String UPDATE_EMPLOYEE_SQL ="update nhan_vien set ho_ten=?,ngay_sinh=?,so_cmnd=?,luong=?,so_dien_thoai=?,email=?,dia_chi=? where id=?;";
    private static final String INSERT_EMPLOYEE_SQL ="insert into nhan_vien(ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,email,dia_chi) values(?,?,?,?,?,?,?);";
    private static final String DELETE= "DELETE FROM nhan_vien WHERE id= ?";
    private static final String SORT_BY_NAME = "select * from nhan_vien order by nhan_vien.ho_ten";
    private static final String SELECT_ALL_EMPLOYEE = "select * from nhan_vien";
    @Override
    public void save(Employee employee) {
        try (PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(employee.getId() > 0 ? UPDATE_EMPLOYEE_SQL : INSERT_EMPLOYEE_SQL)) {
            preparedStatement.setString(2, employee.getName());
            preparedStatement.setString(3, employee.getDob());
            preparedStatement.setString(4, employee.getIdCard());
            preparedStatement.setDouble(5, employee.getSalary());
            preparedStatement.setString(6, employee.getPhoneNumber());
            preparedStatement.setString(7, employee.getEmail());
            preparedStatement.setString(8, employee.getAddress());
            if (employee.getId() > 0) preparedStatement.setInt(9, employee.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    @Override
    public void delete(int id) {
        try(PreparedStatement preparedStatement= ConnectDB.getConnection().prepareStatement(DELETE)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Employee> findAll() {
        return select(SELECT_ALL_EMPLOYEE);
    }

    @Override
    public Optional<Employee> get(int id) {
        try(PreparedStatement preparedStatement= ConnectDB.getConnection().prepareStatement(SELECT_EMPLOYEE_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()){
                return Optional.of(getEmployee(resultSet));
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }
    public List<Employee> select(String sql){
        Connection connection =ConnectDB.getConnection();
        List<Employee> employees = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Employee employee = new Employee();
                employee.setId(resultSet.getInt("ma_nhan_vien"));
                employee.setName(resultSet.getString("ho_ten"));
                employee.setDob(resultSet.getString("ngay_sinh"));
                employee.setIdCard(resultSet.getString("so_cmnd"));
                employee.setSalary(resultSet.getDouble("luong"));
                employee.setPhoneNumber(resultSet.getString("so_dien_thoai"));
                employee.setEmail(resultSet.getString("email"));
                employee.setAddress(resultSet.getString("dia_chi"));
                employees.add(employee);
            }
            System.out.println(preparedStatement);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employees;

    }
    @Override
    public List<Employee> sort() {
        return select(SORT_BY_NAME);
    }

    private Employee getEmployee(ResultSet resultSet) throws SQLException{
        int id= resultSet.getInt(1);
        String name= resultSet.getString(2);
        String dob= resultSet.getString(3);
        String id_card= resultSet.getString(4);
        Double salary= resultSet.getDouble(5);
        String phoneNumber= resultSet.getString(6);
        String email= resultSet.getString(7);
        String address= resultSet.getString(8);
        return new Employee(id, name, dob, id_card, salary, phoneNumber, email,address);
    }
    public List<Employee> find(String text) {
        List<Employee> new_list = new ArrayList<>();
        for (Employee employee : findAll())
            if (employee.getName().toLowerCase().contains(text.toLowerCase())) new_list.add(employee);
        return new_list;
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
}
