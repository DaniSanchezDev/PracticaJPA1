package com.edu.daniel.PracticaJPA1.model.entities;
import java.time.*;

import org.hibernate.annotations.Collate;

import com.edu.daniel.PracticaJPA1.model.enumerated.Categoria;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "cliente")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCliente;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private LocalDate fechaNacimiento;
    private int telefono;
    @Enumerated(EnumType.STRING) // mapea el enum como string
    @Column(name = "categoria", columnDefinition = "ENUM('VIP', 'REGULAR', 'INVITADO','CASUAL')")
    private Categoria categoria;

}
