package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Avion implements Vehicule {

    @Id
    int id;

    String nom;
    String couleur;
    float poids;
    float taille;

    public Avion(String nom, String couleur, float poids, float taille) {
        this.nom = nom;
        this.couleur = couleur;
        this.poids = poids;
        this.taille = taille;
    }

    public void decoler() {
    }

    @Override
    public void avancer() {
    }

    public void atterir() {
    }

    public String getNom() {
        return nom;
    }

    public String getCouleur() {
        return couleur;
    }

    public float getPoids() {
        return poids;
    }

    public float getTaille() {
        return taille;
    }
}