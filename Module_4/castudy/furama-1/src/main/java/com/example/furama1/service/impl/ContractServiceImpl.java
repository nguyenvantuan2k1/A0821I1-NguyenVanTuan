package com.example.furama1.service.impl;

import com.example.furama1.model.Contract;
import com.example.furama1.repository.ContractRepository;
import com.example.furama1.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ContractServiceImpl implements ContractService {

    @Autowired
    private ContractRepository contractRepository;

    @Override
    public Page<Contract> findAll(Pageable pageable) {
        return contractRepository.findAll(pageable);
    }

    @Override
    public Contract findById(int id) {
        return contractRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Contract contract) {
        contractRepository.save(contract);
    }

    @Override
    public void deleteById(int id) {
        contractRepository.deleteById(id);
    }

    @Override
    public Page<Contract> findContractByNameCustomer(String name, Pageable pageable) {
        return contractRepository.findContractByNameCustomer(name, pageable);
    }
}
