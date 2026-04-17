package com.palmaproject.dto;

import java.util.Objects;

public class DiscograficaRequestDTO {
    private String nombre;
    private String direccion;

    public DiscograficaRequestDTO() {
    }

    public DiscograficaRequestDTO(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DiscograficaRequestDTO that = (DiscograficaRequestDTO) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(direccion, that.direccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, direccion);
    }

    @Override
    public String toString() {
        return "DiscograficaRequestDTO{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}