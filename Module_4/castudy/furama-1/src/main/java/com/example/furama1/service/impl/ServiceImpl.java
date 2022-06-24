package com.example.furama1.service.impl;


import com.example.furama1.model.Service;
import com.example.furama1.repository.ServiceRepository;
import com.example.furama1.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceImpl implements IService {

    @Autowired
    private ServiceRepository serviceRepository;


    @Override
    public List<Service> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Page<Service> findAllService(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public Service findServiceById(int id) {
        return serviceRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteServiceById(int id) {
        serviceRepository.deleteById(id);
    }

    @Override
    public Page<Service> findServiceByNameContaining(String key, Pageable pageable) {
        return serviceRepository.findServiceByService_name(key, pageable);
    }

    @Override
    public void saveService(Service service) {
        serviceRepository.save(service);
    }
}
