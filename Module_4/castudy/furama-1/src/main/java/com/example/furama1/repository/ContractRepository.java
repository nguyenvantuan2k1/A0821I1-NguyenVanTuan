package com.example.furama1.repository;

import com.example.furama1.model.Contract;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Integer> {

    @Query("select u from Contract u where u.customerId.customerName = ?1")
    Page<Contract> findContractByNameCustomer(String name, Pageable pageable);
}
