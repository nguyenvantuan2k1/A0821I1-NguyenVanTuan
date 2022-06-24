package com.example.furama1.repository;

import com.example.furama1.model.Position;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PositionRepository extends JpaRepository<Position, Integer> {
}
