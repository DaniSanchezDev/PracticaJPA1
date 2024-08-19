package com.edu.daniel.PracticaJPA1.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.daniel.PracticaJPA1.model.entities.Cliente;
import com.edu.daniel.PracticaJPA1.model.enumerated.Categoria;


public interface IClienteRepository extends JpaRepository <Cliente,Long>{

    public List<Cliente> findByCategoria(Categoria categoria);
}
