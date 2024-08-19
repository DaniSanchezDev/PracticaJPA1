package com.edu.daniel.PracticaJPA1.model.entities;
import java.time.*;

import com.edu.daniel.PracticaJPA1.model.enumerated.Categoria;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "cliente")
public class Cliente {

    private Long idCliente;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private LocalDate fechaNacimiento;
    private int telefono;
    private Categoria categoria;


}
