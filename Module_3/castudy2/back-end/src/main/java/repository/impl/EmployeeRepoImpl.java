package repository.impl;

import model.Employee;
import repository.IEmployeeRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepoImpl implements IEmployeeRepository {
    @Override
    public List<Employee> findAll() {
        Connection connection =ConnectDB.getConnection();
        List<Employee> employees = new ArrayList<>();
        Employee employee = new Employee();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from nhan_vien");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                employee.setId(resultSet.getInt("ma_nhan_vien"));
                employee.setName(resultSet.getString("ho_ten"));
                employee.setDob(resultSet.getString("ngay_sinh"));
                employee.setIdCard(resultSet.getString("so_cmnd"));
                employee.setSalary(resultSet.getDouble("luong"));
                employee.setPhoneNumber(resultSet.getString("so_dien_thoai"));
                employee.setEmail(resultSet.getString("email"));

                employees.add(employee);
            }
            System.out.println(preparedStatement);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employees;
    }
}
