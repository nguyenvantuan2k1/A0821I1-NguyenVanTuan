package com.example.furama1.service;

import com.example.furama1.model.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ContractService {

    Page<Contract> findAll(Pageable pageable);
    Contract findById(int id);
    void save(Contract contract);
    void deleteById(int id);

    Page<Contract> findContractByNameCustomer(String name, Pageable pageable);

}
