package com.edu.daniel.PracticaJPA1.model.entities;
import java.time.*;


import jakarta.persistence.Column;

public class Staff {


    private Long idStaff;
    private String nombre;
    private String apellido1;
    @Column(name = "apellido2",nullable = true)
    private String apellido2;
    private LocalDate fechaNacimiento;
    private int telefono;
    

}
