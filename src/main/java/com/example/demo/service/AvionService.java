package com.example.demo.service;

import com.example.demo.model.Avion;
import org.springframework.stereotype.Service;

@Service
public class AvionService {

    public Avion create(String nom, String couleur, float poids, float taille) {
        Avion avion = new Avion(nom, couleur, poids, taille);
        return avion;
    }
}