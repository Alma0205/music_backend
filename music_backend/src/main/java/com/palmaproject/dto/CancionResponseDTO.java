package com.palmaproject.dto;

import java.util.Objects;

public class CancionResponseDTO {
    private Long id;
    private String titulo;
    private String productorNombre;

    public CancionResponseDTO() {
    }

    public CancionResponseDTO(Long id, String titulo, String productorNombre) {
        this.id = id;
        this.titulo = titulo;
        this.productorNombre = productorNombre;
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

    public String getProductorNombre() {
        return productorNombre;
    }

    public void setProductorNombre(String productorNombre) {
        this.productorNombre = productorNombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CancionResponseDTO that = (CancionResponseDTO) o;
        return Objects.equals(id, that.id) && Objects.equals(titulo, that.titulo) && Objects.equals(productorNombre, that.productorNombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titulo, productorNombre);
    }

    @Override
    public String toString() {
        return "CancionResponseDTO{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", productorNombre='" + productorNombre + '\'' +
                '}';
    }
}