package com.example.demo.repository;


import com.example.demo.model.Conducteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConducteurRepository extends JpaRepository<Conducteur, Integer> {
}
