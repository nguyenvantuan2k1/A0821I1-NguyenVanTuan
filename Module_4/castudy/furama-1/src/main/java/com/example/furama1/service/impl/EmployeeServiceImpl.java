package com.example.furama1.service.impl;

import com.example.furama1.model.Employee;
import com.example.furama1.repository.EmployeeRepository;
import com.example.furama1.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Page<Employee> findAllEmployee(Pageable pageable) {
        return employeeRepository.findAll(pageable);
    }

    @Override
    public Employee findEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployeeById(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Page<Employee> findEmployeeByNameContaining(String name, Pageable pageable) {
        return employeeRepository.findEmployeeByNameContaining(name, pageable);
    }
}
