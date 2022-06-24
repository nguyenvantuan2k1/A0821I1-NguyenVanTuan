package com.example.furama1.service;

import com.example.furama1.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {
    Page<User> findAll(Pageable pageable);
    User findById(int id);
    void save(User user);
    void deleteById(int id);
}
