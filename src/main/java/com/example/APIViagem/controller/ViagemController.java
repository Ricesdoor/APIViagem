package com.example.APIViagem.controller;

import com.example.APIViagem.entities.Viagem;
import com.example.APIViagem.service.ViagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/viagens")
public class ViagemController {

    @Autowired
    private ViagemService viagemService;

    // Adiciona uma nova viagem
    @PostMapping
    public Viagem addViagem(@RequestBody Viagem viagem) {
        return viagemService.addViagem(viagem);
    }

    // Retorna todas as viagens
    @GetMapping
    public List<Viagem> getAllViagens() {
        return viagemService.getAllViagens();
    }

    // Retorna uma viagem específica por ID
    @GetMapping("/{id}")
    public Optional<Viagem> getViagemById(@PathVariable Long id) {
        return viagemService.getViagemById(id);
    }

    // Exclui uma viagem por ID
    @DeleteMapping("/{id}")
    public boolean deleteViagem(@PathVariable Long id) {
        return viagemService.deleteViagem(id);
    }
}
