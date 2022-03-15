package service.impl;

import model.entity.Employee;
import repository.impl.EmployeeRepoImpl;
import service.EmployeeService;

import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRepoImpl employeeRepository = new EmployeeRepoImpl();
    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Optional<Employee> get(int id) {
        return employeeRepository.get(id);
    }

    @Override
    public List<Employee> sort() {
        return employeeRepository.sort();
    }

    @Override
    public List<Employee> find(String text) {
        return employeeRepository.find(text);
    }

    @Override
    public void save(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void delete(int id) {
        employeeRepository.delete(id);
    }
}
