package com.cpt202.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cpt202.demo.entity.Manager;
import java.util.List;


@Repository
public interface ManagerRepo extends JpaRepository<Manager, Integer> {
    // Custom queries (if needed)
    List<Manager> findAll();
}
