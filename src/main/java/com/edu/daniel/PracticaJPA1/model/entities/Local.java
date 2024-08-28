package com.edu.daniel.PracticaJPA1.model.entities;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.*;

@Entity
@Table (name = "local")
public class Local {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idLocal;
    private String nombre;
    private int aforoMax;
    private Double metrosCuadrados;

    @ManyToMany(mappedBy = "locales", fetch = FetchType.EAGER)
    private Set<Cliente> clientes = new HashSet<>();


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


    @Override
    public String toString() {
        return "Local [idLocal=" + idLocal + ", nombre=" + nombre + ", aforoMax=" + aforoMax + ", metrosCuadrados="
                + metrosCuadrados + "]";
    }

    


}
