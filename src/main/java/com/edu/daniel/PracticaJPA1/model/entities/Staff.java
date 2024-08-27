package com.edu.daniel.PracticaJPA1.model.entities;
import java.time.*;

import com.edu.daniel.PracticaJPA1.model.enumerated.Cargo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "staff")
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idStaff;
    private String nombre;
    private String apellido1;
    @Column(name = "apellido2",nullable = true)
    private String apellido2;
    private LocalDate fechaNacimiento;
    private int telefono;
    @Enumerated(EnumType.STRING)
    @Column(name = "cargo", columnDefinition = "ENUM('GERENTE', 'ENCARGADO', 'SEGURIDAD','CAMARERO', 'LIMPIEZA', 'RUNNER')")
    private Cargo cargo;
    private int local_id;

    public Staff() {
    }
    public Staff(Long idStaff, String nombre, String apellido1, String apellido2, LocalDate fechaNacimiento,
            int telefono, Cargo cargo, int local_id) {
        this.idStaff = idStaff;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.cargo = cargo;
        this.local_id = local_id;
    }
    public Long getIdStaff() {
        return idStaff;
    }
    public void setIdStaff(Long idStaff) {
        this.idStaff = idStaff;
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
    public Cargo getCargo() {
        return cargo;
    }
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    public int getLocal_id() {
        return local_id;
    }
    public void setLocal_id(int local_id) {
        this.local_id = local_id;
    }

    
    @Override
    public String toString() {
        return "Staff [idStaff=" + idStaff + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2="
                + apellido2 + ", fechaNacimiento=" + fechaNacimiento + ", telefono=" + telefono + ", cargo=" + cargo
                + ", local_id=" + local_id + "]";
    }

    
    

}
