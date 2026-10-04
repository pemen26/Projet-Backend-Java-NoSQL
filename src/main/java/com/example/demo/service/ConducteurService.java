package com.example.demo.service;

import com.example.demo.model.Conducteur;
import org.springframework.stereotype.Service;

@Service
public class ConducteurService {

    public Conducteur create(String nom, int age, float poids) {
        Conducteur conducteur = new Conducteur(nom, age, poids);
        return conducteur;
    }
}