package com.example.furama1.service.impl;

import com.example.furama1.model.RentType;
import com.example.furama1.repository.RentTypeRepository;
import com.example.furama1.service.RentTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeServiceImpl implements RentTypeService {

    @Autowired
    private RentTypeRepository rentTypeRepository;

    @Override
    public List<RentType> findAll() {
        return rentTypeRepository.findAll();
    }
}
