package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Conducteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String nom;
    int age;
    float poids;

    public Conducteur() {
    }

    public Conducteur(String nom, int age, float poids) {
        this.nom = nom;
        this.age = age;
        this.poids = poids;
    }

    public void conduire(Voiture v) {
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public float getPoids() {
        return poids;
    }
}