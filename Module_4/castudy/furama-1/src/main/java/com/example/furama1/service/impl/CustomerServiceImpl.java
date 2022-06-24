package com.example.furama1.service.impl;

import com.example.furama1.model.Customer;
import com.example.furama1.repository.CustomerRepository;
import com.example.furama1.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Page<Customer> findAllCustomer(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Customer findCustomerById(int id) {
        return customerRepository.findById(id).orElse(null);
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void deleteCustomerById(int id) {
        customerRepository.deleteById(id);
    }

    @Override
    public Page<Customer> findCustomerByNameContaining(String name, Pageable pageable) {
        return customerRepository.findCustomerByCustomerNameContaining(name, pageable);
    }
}
