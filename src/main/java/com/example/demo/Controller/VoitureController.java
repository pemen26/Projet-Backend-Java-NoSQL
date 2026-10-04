package com.example.demo.controller;

import com.example.demo.model.Voiture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.service.VoitureService;

@RestController
@RequestMapping("/voiture")
public class VoitureController {

    private final VoitureService voitureService;

    @Autowired
    public VoitureController(VoitureService voitureService) {
        this.voitureService = voitureService;
    }

    @GetMapping
    public String message() {
        return "Toyota disponible";
    }

    @PostMapping
    public Voiture create(@RequestParam float taille,
                          @RequestParam float poids,
                          @RequestParam String couleur,
                          @RequestParam String nom) {
        return voitureService.create(taille, poids, couleur, nom);
    }
}