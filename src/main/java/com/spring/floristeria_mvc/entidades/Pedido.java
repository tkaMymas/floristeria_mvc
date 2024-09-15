package com.spring.floristeria_mvc.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreCliente, direccionCliente, contactoCliente, tipoArreglo, ocasion, fechaEntrega, estado;
    private double presupuesto;

    // ID
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    // Nombre Cliente
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    // Direccion Cliente
    public String getDireccionCliente() {
        return direccionCliente;
    }
    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }
    // Contacto Cliente
    public String getContactoCliente() {
        return contactoCliente;
    }
    public void setContactoCliente(String contactoCliente) {
        this.contactoCliente = contactoCliente;
    }
    // Tipo Arreglo
    public String getTipoArreglo() {
        return tipoArreglo;
    }
    public void setTipoArreglo(String tipoArreglo) {
        this.tipoArreglo = tipoArreglo;
    }
    // Ocasion
    public String getOcasion() {
        return ocasion;
    }
    public void setOcasion(String ocasion) {
        this.ocasion = ocasion;
    }
    // Fecha Entrega
    public String getFechaEntrega() {
        return fechaEntrega;
    }
    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
    // Estado
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    // Presupuesto
    public double getPresupuesto() {
        return presupuesto;
    }
    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }
}
