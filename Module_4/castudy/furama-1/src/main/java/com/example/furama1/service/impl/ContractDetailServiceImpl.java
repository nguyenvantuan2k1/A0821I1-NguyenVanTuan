package com.example.furama1.service.impl;

import com.example.furama1.model.ContractDetails;
import com.example.furama1.repository.ContractDetailsRepository;
import com.example.furama1.service.ContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContractDetailServiceImpl implements ContractDetailService {

    @Autowired
    private ContractDetailsRepository contractDetailsRepository;

    @Override
    public ContractDetails findContractDetailsById(int id) {
        return contractDetailsRepository.findById(id).orElse(null);
    }

    @Override
    public ContractDetails findContractDetailsByIdContract(int id) {
        return contractDetailsRepository.findContractDetailsByContractId(id);
    }

    @Override
    public void save(ContractDetails contractDetails) {
        contractDetailsRepository.save(contractDetails);
    }

}
