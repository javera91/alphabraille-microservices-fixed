package com.alphabraille.participants.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class ParticipantWithUsabilityDto {
    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    @JsonProperty("usability")
    private List<UsabilityDto> usabilityRecords;

    // Constructores
    public ParticipantWithUsabilityDto() {}

    public ParticipantWithUsabilityDto(Long id, String nombre, String apellido, String correo, List<UsabilityDto> usabilityRecords) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.usabilityRecords = usabilityRecords;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<UsabilityDto> getUsabilityRecords() {
        return usabilityRecords;
    }

    public void setUsabilityRecords(List<UsabilityDto> usabilityRecords) {
        this.usabilityRecords = usabilityRecords;
    }
}
