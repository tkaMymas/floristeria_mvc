package com.spring.floristeria_mvc.entidades;

import jakarta.persistence.*;

@Entity
public class Entrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreConductor, ruta, estadoEntrega;

    @ManyToOne
    private Pedido pedido;

    // ID
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    // Nombre Conductor
    public String getNombreConductor() {
        return nombreConductor;
    }
    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }
    // Ruta
    public String getRuta() {
        return ruta;
    }
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    // Estado de Entrega
    public String getEstadoEntrega() {
        return estadoEntrega;
    }
    public void setEstadoEntrega(String estadoEntrega) {
        this.estadoEntrega = estadoEntrega;
    }
    // Pedido
    public Pedido getPedido() {
        return pedido;
    }
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
