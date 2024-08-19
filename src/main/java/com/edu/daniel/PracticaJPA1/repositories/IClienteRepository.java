package com.edu.daniel.PracticaJPA1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.daniel.PracticaJPA1.model.entities.Cliente;

public interface IClienteRepository extends JpaRepository <Cliente,Long>{

}
