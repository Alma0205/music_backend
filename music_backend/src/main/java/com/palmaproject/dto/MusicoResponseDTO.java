package com.palmaproject.dto;

import java.util.Objects;

public class MusicoResponseDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String genero;
    private String instrumento;

    public MusicoResponseDTO() {
    }

    public MusicoResponseDTO(Long id, String nombre, String apellido, String genero, String instrumento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.instrumento = instrumento;
    }

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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicoResponseDTO that = (MusicoResponseDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido) && Objects.equals(genero, that.genero) && Objects.equals(instrumento, that.instrumento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, genero, instrumento);
    }

    @Override
    public String toString() {
        return "MusicoResponseDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", genero='" + genero + '\'' +
                ", instrumento='" + instrumento + '\'' +
                '}';
    }
}
