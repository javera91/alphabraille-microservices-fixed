package com.alphabraille.usability.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usability_log")
public class UsabilityLog {
    @Id
    private Integer id; // Relacionado con el ID de participants
    
    @Column(nullable = false)
    private String estado; // "satisfecho" o "insatisfecho"

    // Constructors
    public UsabilityLog() {}

    public UsabilityLog(Integer id, String estado) {
        this.id = id;
        this.estado = estado;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
