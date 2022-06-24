package com.example.furama1.service.impl;

import com.example.furama1.model.AttachService;
import com.example.furama1.repository.AttachServiceRepository;
import com.example.furama1.service.AttachServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AttachServiceImpl implements AttachServiceService {

    @Autowired
    private AttachServiceRepository attachServiceRepository;

    @Override
    public List<AttachService> findAll() {
        return attachServiceRepository.findAll();
    }
}
