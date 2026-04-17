package com.palmaproject.dto;

import java.util.Objects;

public class ProductorResponseDTO {
    private Long id;
    private String nombre;
    private String apellido;
    private String especialidad;

    public ProductorResponseDTO() {
    }

    public ProductorResponseDTO(Long id, String nombre, String apellido, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductorResponseDTO that = (ProductorResponseDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido) && Objects.equals(especialidad, that.especialidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, especialidad);
    }

    @Override
    public String toString() {
        return "ProductorResponseDTO{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}