package com.palmaproject.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "productores")
public class Productor extends Persona {

    @Column(nullable = false, length = 50)
    private String especialidad;

    public Productor() {
    }

    public Productor(Long id, String nombre, String apellido, String especialidad) {
        super(id, nombre, apellido);
        this.especialidad = especialidad;
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
        if (!super.equals(o)) return false;
        Productor productor = (Productor) o;
        return Objects.equals(especialidad, productor.especialidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), especialidad);
    }

    @Override
    public String toString() {
        return "Productor{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}