package com.palmaproject.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "musicos")
public class Musico extends Persona {

    @Column(nullable = false, length = 20)
    private String genero;

    @Column(nullable = false, length = 30)
    private String instrumento;

    public Musico() {
    }

    public Musico(Long id, String nombre, String apellido, String genero, String instrumento) {
        super(id, nombre, apellido);
        this.genero = genero;
        this.instrumento = instrumento;
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
        if (!super.equals(o)) return false;
        Musico musico = (Musico) o;
        return Objects.equals(genero, musico.genero) && Objects.equals(instrumento, musico.instrumento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), genero, instrumento);
    }

    @Override
    public String toString() {
        return "Musico{" +
                "id=" + getId() +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", genero='" + genero + '\'' +
                ", instrumento='" + instrumento + '\'' +
                '}';
    }
}