package com.edu.daniel.PracticaJPA1.model.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "local")
public class Local {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idLocal;
    private String nombre;
    private int aforoMax;
    private Double metrosCuadrados;


    public Local() {}


    public Local(Long idLocal, String nombre, int aforoMax, Double metrosCuadrados) {
        this.idLocal = idLocal;
        this.nombre = nombre;
        this.aforoMax = aforoMax;
        this.metrosCuadrados = metrosCuadrados;
    }


    public Long getIdLocal() {
        return idLocal;
    }


    public void setIdLocal(Long idLocal) {
        this.idLocal = idLocal;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public int getAforoMax() {
        return aforoMax;
    }


    public void setAforoMax(int aforoMax) {
        this.aforoMax = aforoMax;
    }


    public Double getMetrosCuadrados() {
        return metrosCuadrados;
    }


    public void setMetrosCuadrados(Double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    


}
