package com.spring.floristeria_mvc.entidades;

import jakarta.persistence.*;

@Entity
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double total;
    private String fechaEmision;

    @ManyToOne
    private Pedido pedido;

    // ID
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    // Total
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    // Fecha Emision
    public String getFechaEmision() {
        return fechaEmision;
    }
    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    // Pedido
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
