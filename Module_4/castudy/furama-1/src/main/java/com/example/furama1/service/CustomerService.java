package com.example.furama1.service;

import com.example.furama1.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Page<Customer> findAllCustomer(Pageable pageable);
    Customer findCustomerById(int id);
    void saveCustomer(Customer customer);
    void deleteCustomerById(int id);

    Page<Customer> findCustomerByNameContaining(String name, Pageable pageable);


}
