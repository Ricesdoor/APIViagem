package com.example.APIViagem.repositories;

import com.example.APIViagem.entities.Viagem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ViagemRepository extends JpaRepository<Viagem, Long> {
    // Aqui podemos adicionar consultas personalizadas se necessário
}
