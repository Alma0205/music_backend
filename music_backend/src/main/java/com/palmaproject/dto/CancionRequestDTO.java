package com.palmaproject.dto;

import java.util.Objects;

public class CancionRequestDTO {
    private String titulo;
    private Long productorId;

    public CancionRequestDTO() {
    }

    public CancionRequestDTO(String titulo, Long productorId) {
        this.titulo = titulo;
        this.productorId = productorId;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getProductorId() {
        return productorId;
    }

    public void setProductorId(Long productorId) {
        this.productorId = productorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CancionRequestDTO that = (CancionRequestDTO) o;
        return Objects.equals(titulo, that.titulo) && Objects.equals(productorId, that.productorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, productorId);
    }

    @Override
    public String toString() {
        return "CancionRequestDTO{" +
                "titulo='" + titulo + '\'' +
                ", productorId=" + productorId +
                '}';
    }
}