package com.example.APIViagem.entities;

import jakarta.persistence.*;  // Importando JPA

@Entity
@Table(name = "viagens")  // Define o nome da tabela no banco
public class Viagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Gera o ID automaticamente
    private Long id;

    @Column(nullable = false)  // Define que o campo não pode ser nulo
    private String destino;

    @Column(nullable = false)
    private String origem;

    @Column(nullable = false)
    private Double custo;

    @Column(nullable = false)
    private String data;

    // Getters e setters ou usar @Data do Lombok

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public Double getCusto() {
        return custo;
    }

    public void setCusto(Double custo) {
        this.custo = custo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
