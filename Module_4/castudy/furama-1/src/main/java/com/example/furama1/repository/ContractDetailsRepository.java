package com.example.furama1.repository;

import com.example.furama1.model.ContractDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractDetailsRepository extends JpaRepository<ContractDetails, Integer> {

    @Query("select u from Contract u where u.contractId = ?1")
    ContractDetails findContractDetailsByContractId(int id);
}
