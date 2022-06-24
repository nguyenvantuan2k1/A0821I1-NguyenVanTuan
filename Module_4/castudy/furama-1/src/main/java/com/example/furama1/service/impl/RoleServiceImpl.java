package com.example.furama1.service.impl;


import com.example.furama1.model.Role;
import com.example.furama1.repository.RoleRepository;
import com.example.furama1.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepository repository;

    @Override
    public List<Role> findAll() {
        return repository.findAll();
    }

    @Override
    public Role findByName(String name) {
        return repository.findByName(name);
    }
}
