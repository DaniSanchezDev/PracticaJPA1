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


}
