package com.example.furama1.repository;

import com.example.furama1.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    @Query("select u from Employee u where u.employeeName = ?1")
    Page<Employee> findEmployeeByNameContaining(String name, Pageable pageable);
}
