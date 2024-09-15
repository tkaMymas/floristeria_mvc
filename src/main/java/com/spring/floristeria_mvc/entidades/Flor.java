package com.spring.floristeria_mvc.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Flor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo, color, variedad;
    private int cantidadDisponible;
    private double precioCompra, precioVenta;

    // ID
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    // Tipo
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    // Color
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    // Variedad
    public String getVariedad() {
        return variedad;
    }
    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }
    // Cantidad Disponible
    public int getCantidadDisponible() {
        return cantidadDisponible;
    }
    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }
    // Precio Compra
    public double getPrecioCompra() {
        return precioCompra;
    }
    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }
    // Precio Venta
    public double getPrecioVenta() {
        return precioVenta;
    }
    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }
}
