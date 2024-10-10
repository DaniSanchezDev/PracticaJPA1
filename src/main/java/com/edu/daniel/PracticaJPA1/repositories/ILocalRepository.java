package com.edu.daniel.PracticaJPA1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;


import com.edu.daniel.PracticaJPA1.model.entities.Local;

public interface ILocalRepository extends JpaRepository <Local, Long>{

    public List<Local> findByAforoMaxBetween(int aforoMin, int aforoMax);
}
