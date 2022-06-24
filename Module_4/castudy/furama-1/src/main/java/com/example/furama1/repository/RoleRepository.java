package com.example.furama1.repository;

import com.example.furama1.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    @Query("select u from Role u where u.roleName = ?1")
    Role findByName(String name);
}
