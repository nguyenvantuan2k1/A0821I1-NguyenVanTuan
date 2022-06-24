package com.example.furama1.service;

import com.example.furama1.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Page<Employee> findAllEmployee(Pageable pageable);
    Employee findEmployeeById(int id);
    void saveEmployee(Employee employee);
    void deleteEmployeeById(int id);

    Page<Employee> findEmployeeByNameContaining(String name, Pageable pageable);

}
