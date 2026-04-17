package com.palmaproject.dto;

import java.util.Objects;

public class ProductorRequestDTO {
    private String nombre;
    private String apellido;
    private String especialidad;

    public ProductorRequestDTO() {
    }

    public ProductorRequestDTO(String nombre, String apellido, String especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
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
        ProductorRequestDTO that = (ProductorRequestDTO) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(apellido, that.apellido) && Objects.equals(especialidad, that.especialidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, especialidad);
    }

    @Override
    public String toString() {
        return "ProductorRequestDTO{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}