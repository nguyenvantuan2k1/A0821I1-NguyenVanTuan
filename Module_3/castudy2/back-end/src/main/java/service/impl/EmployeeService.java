package service.impl;

import model.dto.EmployeeDTO;
import model.entity.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private static final String SELECT_EMPLOYEE_ID = "select * from product where id= ?";
    private static final String UPDATE_EMPLOYEE_SQL = "update product set name=?,price=?,quantity=?,color=?,categoryid=? where id=?";
    private static final String INSERT_EMPLOYEE_SQL = "insert into product(name,price,quantity,color,categoryid) values(?,?,?,?,?)";
    private static final String DELETE = "DELETE FROM product WHERE id= ?";
    private static final String SORT_BY_NAME = "select * from nhan_vien order by nhan_vien.ho_ten";
    private static final String SELECT_ALL_EMPLOYEEDTO = "select p.id,p.name,p.price,p.quantity,p.color,c.name as category from product p join category c on p.categoryid=c.id;";
    private static final String FindName = "select * from nhan_vien where ho_ten like %?";
    private static  final String SORT_DTO="select nv.ma_nhan_vien,nv.ho_ten,nv.ngay_sinh,nv.so_cmnd,nv.luong,nv.so_dien_thoai, vt.ten_vi_tri from nhan_Vien as nv join vi_tri as vt on nv.ma_vi_tri=vt.ma_vi_tri order by nv.ho_ten";
    private static final String FindNameDTO="select nv.ho_ten,nv.ngay_sinh,nv.so_cmnd,nv.luong,nv.so_dien_thoai, vt.ten_vi_tri from nhan_Vien as nv join vi_tri as vt on nv.ma_vi_tri=vt.ma_vi_tri where nv.ho_ten like '%?%'";


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


    public List<EmployeeDTO> getAll() {
        return selectDTO(SELECT_ALL_EMPLOYEEDTO);
    }

    public void save(Employee employee) {
        try (PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(employee.getId() > 0 ? UPDATE_EMPLOYEE_SQL : INSERT_EMPLOYEE_SQL)) {
            preparedStatement.setString(1, employee.getName());
            preparedStatement.setDouble(2, employee.getPrice());
            preparedStatement.setInt(3, employee.getQuantity());
            preparedStatement.setString(4, employee.getColor());
            preparedStatement.setInt(5, employee.getCategoryid());
            if (employee.getId() > 0) preparedStatement.setInt(6, employee.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }


    public void delete(int id) {
        try (PreparedStatement preparedStatement = ConnectDB.getConnection().prepareStatement(DELETE)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Employee get(int id) {
        try(PreparedStatement preparedStatement= ConnectDB.getConnection().prepareStatement(SELECT_EMPLOYEE_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet= preparedStatement.executeQuery();
            while (resultSet.next()){
                return getEmployee(resultSet);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }


    public Employee getEmployee(ResultSet resultSet)throws SQLException{
        int id= resultSet.getInt(1);
        String name= resultSet.getString(2);
        double price= Double.parseDouble(resultSet.getString(3));
        int quantity= Integer.parseInt(resultSet.getString(4));
        String color= resultSet.getString(5);
        int categoryid= resultSet.getInt(6);
        return new Employee(id,name,price,quantity,color,categoryid);
    }

//    public List<EmployeeDTO> sort(){
//        Connection connection = ConnectDB.getConnection();
//        List<EmployeeDTO> employees = new ArrayList<>();
//
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(SORT_DTO);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                EmployeeDTO employee = new EmployeeDTO();
//                employee.setId(resultSet.getInt("ma_nhan_vien"));
//                employee.setName(resultSet.getString("ho_ten"));
//                employee.setDob(resultSet.getString("ngay_sinh"));
//                employee.setIdCard(resultSet.getString("so_cmnd"));
//                employee.setSalary(resultSet.getDouble("luong"));
//                employee.setPhoneNumber(resultSet.getString("so_dien_thoai"));
//                employee.setPosition(resultSet.getString("ten_vi_tri"));
//                employees.add(employee);
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return employees;
//    }
    public List<EmployeeDTO> search(String find) {
        if(find.equals("")){
            return getAll();
        }else{
            List<EmployeeDTO> new_list = new ArrayList<>();
            for (EmployeeDTO employee : getAll())
                if (employee.getName().toLowerCase().contains(find.toLowerCase())) new_list.add(employee);
            return new_list;
        }
    }
    public List<EmployeeDTO> selectDTO(String sql) {
        Connection connection = ConnectDB.getConnection();
        List<EmployeeDTO> employees = new ArrayList<>();

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                EmployeeDTO employee = new EmployeeDTO();
                employee.setId(resultSet.getInt("id"));
                employee.setName(resultSet.getString("name"));
                employee.setPrice(resultSet.getDouble("price"));
                employee.setQuantity(resultSet.getInt("quantity"));
                employee.setColor(resultSet.getString("color"));
                employee.setCategory(resultSet.getString("category"));
                employees.add(employee);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employees;
    }

}
