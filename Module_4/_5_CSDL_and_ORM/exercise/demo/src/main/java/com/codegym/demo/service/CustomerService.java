package com.codegym.demo.service;


import com.codegym.demo.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Optional<Customer> findById(int id);

    void remove(int id);
}
