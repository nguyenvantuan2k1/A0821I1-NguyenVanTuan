package com.example.furama1.service;


import com.example.furama1.model.ContractDetails;

public interface ContractDetailService {
    ContractDetails findContractDetailsById(int id);
    ContractDetails findContractDetailsByIdContract(int id);
    void save(ContractDetails contractDetails);
}
