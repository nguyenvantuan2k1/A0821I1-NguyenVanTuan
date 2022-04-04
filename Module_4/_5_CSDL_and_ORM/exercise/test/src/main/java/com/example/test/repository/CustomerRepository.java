package com.example.test.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends IGeneralRepository<Customer> {
    List<Customer> findAll();
}
