package com.example.furama1.repository;

import com.example.furama1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String email);

    Boolean existsUsersByUsername(String username);
}
