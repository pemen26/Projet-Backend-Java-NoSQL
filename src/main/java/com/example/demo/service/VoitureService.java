package com.example.demo.service;

import com.example.demo.model.Voiture;
import org.springframework.stereotype.Service;

@Service
public class VoitureService {

    public Voiture create(float taille, float poids, String couleur, String nom) {
        Voiture voiture = new Voiture(taille, poids, couleur, nom);
        return voiture;
    }
}