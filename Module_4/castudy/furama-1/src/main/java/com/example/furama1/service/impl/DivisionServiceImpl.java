package com.example.furama1.service.impl;

import com.example.furama1.model.Division;
import com.example.furama1.repository.DivisionRepository;
import com.example.furama1.service.DivisionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements DivisionService {
    @Autowired
    private DivisionRepository divisionRepository;

    @Override
    public List<Division> findAll() {
        return divisionRepository.findAll();
    }
}
