package com.edu.daniel.PracticaJPA1.model.entities;
import java.time.*;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Visita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVisita;
    private Long idCliente;
    private Long idLocal;
    private LocalDate fechaVisita;

}
