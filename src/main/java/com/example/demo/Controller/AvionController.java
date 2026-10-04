package com.example.demo.controller;

import com.example.demo.model.Avion;
import com.example.demo.service.AvionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/avion")
public class AvionController {

    private final AvionService avionService;

    @Autowired
    public AvionController(AvionService avionService) {
        this.avionService = avionService;
    }

    @GetMapping
    public String message() {
        return "Avion disponible";
    }

    @PostMapping
    public Avion create(@RequestParam String nom,
                        @RequestParam String couleur,
                        @RequestParam float poids,
                        @RequestParam float taille) {
        return avionService.create(nom, couleur, poids, taille);
    }
}