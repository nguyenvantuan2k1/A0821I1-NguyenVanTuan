package com.example.test.repository;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository{
    @Autowired
    CustomerRepository customerRepository;
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
