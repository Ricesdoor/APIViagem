package com.example.APIViagem.service;

import com.example.APIViagem.entities.Viagem;
import com.example.APIViagem.repositories.ViagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ViagemService {

    @Autowired
    private ViagemRepository viagemRepository;

    // Adiciona uma nova viagem
    public Viagem addViagem(Viagem viagem) {
        return viagemRepository.save(viagem);
    }

    // Retorna todas as viagens
    public List<Viagem> getAllViagens() {
        return viagemRepository.findAll();
    }

    // Retorna uma viagem específica por ID
    public Optional<Viagem> getViagemById(Long id) {
        return viagemRepository.findById(id);
    }

    // Exclui uma viagem por ID
    public boolean deleteViagem(Long id) {
        if (viagemRepository.existsById(id)) {
            viagemRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
