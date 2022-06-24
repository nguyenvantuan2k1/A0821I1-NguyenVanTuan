package com.example.furama1.service.impl;


import com.example.furama1.model.ServiceType;
import com.example.furama1.repository.ServiceTypeRepository;
import com.example.furama1.service.ServiceTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceTypeServiceImpl implements ServiceTypeService {

    @Autowired
    private ServiceTypeRepository serviceTypeRepository;

    @Override
    public List<ServiceType> findAll() {
        return serviceTypeRepository.findAll();
    }
}
