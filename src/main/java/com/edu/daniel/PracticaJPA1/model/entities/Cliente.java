package com.edu.daniel.PracticaJPA1.model.entities;
import java.time.*;

import com.edu.daniel.PracticaJPA1.model.enumerated.Categoria;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.*;


@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    private String nombre;
    private String apellido1;
    @Column(name = "apellido2",nullable = true)
    private String apellido2;
    private LocalDate fechaNacimiento;
    private int telefono;
    @Enumerated(EnumType.STRING) // mapea el enum como string
    @Column(name = "categoria", columnDefinition = "ENUM('VIP', 'REGULAR', 'INVITADO','CASUAL')")
    private Categoria categoria;

    @ManyToMany (fetch = FetchType.EAGER)
    @JoinTable(
        name = "visita",
        joinColumns = @JoinColumn(name = "idCliente"),
        inverseJoinColumns = @JoinColumn(name = "idLocal")
    )
    private Set <Local> locales = new HashSet<>();


    public Cliente() {

    }


    public Cliente(Long idCliente, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento,
            int telefono, Categoria categoria) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.categoria = categoria;
    }


    public Long getIdCliente() {
        return idCliente;
    }


    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getApellido1() {
        return apellido1;
    }


    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }


    public String getApellido2() {
        return apellido2;
    }


    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }


    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }


    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public int getTelefono() {
        return telefono;
    }


    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }


    public Categoria getCategoria() {
        return categoria;
    }


    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }


    @Override
    public String toString() {
        return "Cliente [idCliente=" + idCliente + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
                + apellido2 + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", categoria="
                + categoria + "]";
    }

    
    
}
