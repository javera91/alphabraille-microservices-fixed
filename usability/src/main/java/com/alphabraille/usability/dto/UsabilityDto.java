package com.alphabraille.usability.dto;

public class UsabilityDto {
    private Long id;
    private Long participantId;
    private String estado;

    // Constructores
    public UsabilityDto() {}

    public UsabilityDto(Long id, Long participantId, String estado) {
        this.id = id;
        this.participantId = participantId;
        this.estado = estado;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParticipantId() {
        return participantId;
    }

    public void setParticipantId(Long participantId) {
        this.participantId = participantId;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
