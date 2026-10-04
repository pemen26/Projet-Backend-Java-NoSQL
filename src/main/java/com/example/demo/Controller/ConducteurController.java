package com.example.demo.controller;

import com.example.demo.model.Conducteur;
import com.example.demo.service.ConducteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/conducteur")
public class ConducteurController {

    private final ConducteurService conducteurService;

    @Autowired
    public ConducteurController(ConducteurService conducteurService) {
        this.conducteurService = conducteurService;
    }

    @GetMapping
    public String message() {
        return "Conducteur disponible";
    }

    @PostMapping
    public Conducteur create(@RequestParam String nom,
                             @RequestParam int age,
                             @RequestParam float poids) {
        return conducteurService.create(nom, age, poids);
    }
}