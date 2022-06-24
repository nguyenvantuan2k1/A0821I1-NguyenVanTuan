package com.example.furama1.service.impl;

import com.example.furama1.model.Position;
import com.example.furama1.repository.PositionRepository;
import com.example.furama1.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionRepository positionRepository;

    @Override
    public List<Position> findAll() {
        return positionRepository.findAll();
    }
}
