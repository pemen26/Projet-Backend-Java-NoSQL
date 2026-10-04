package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Voiture implements Vehicule {

    @Id
    int id;

    float taille;
    float poids;
    String couleur;
    String nom;

    public Voiture(float taille, float poids, String couleur, String nom) {
        this.nom = nom;
        this.couleur = couleur;
        this.poids = poids;
        this.taille = taille;
    }

    @Override
    public void avancer() {
    }

    public boolean freiner() {
        return true;
    }

    public void reculer() {
    }

    public float getTaille() {
        return taille;
    }

    public float getPoids() {
        return poids;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getNom() {
        return nom;
    }
}