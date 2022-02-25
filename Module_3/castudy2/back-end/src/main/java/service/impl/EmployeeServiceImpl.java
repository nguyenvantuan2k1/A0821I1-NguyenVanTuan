package service.impl;

import model.Employee;
import repository.IEmployeeRepository;
import repository.impl.EmployeeRepoImpl;
import service.EmployeeService;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    IEmployeeRepository employeeRepository = new EmployeeRepoImpl();
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }
}
