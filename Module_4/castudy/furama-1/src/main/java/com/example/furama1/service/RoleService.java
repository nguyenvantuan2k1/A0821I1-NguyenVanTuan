package com.example.furama1.service;


import com.example.furama1.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> findAll();
    Role findByName(String name);
}
