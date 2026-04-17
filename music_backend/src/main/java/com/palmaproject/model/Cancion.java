package com.palmaproject.model;

import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "canciones")
public class Cancion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String titulo;

    @ManyToOne
    @JoinColumn(name = "productor_id")
    private Productor productor;

    public Cancion() {
    }

    public Cancion(Long id, String titulo, Productor productor) {
        this.id = id;
        this.titulo = titulo;
        this.productor = productor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Productor getProductor() {
        return productor;
    }

    public void setProductor(Productor productor) {
        this.productor = productor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cancion cancion = (Cancion) o;
        return Objects.equals(id, cancion.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Cancion{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", productor=" + productor +
                '}';
    }
}