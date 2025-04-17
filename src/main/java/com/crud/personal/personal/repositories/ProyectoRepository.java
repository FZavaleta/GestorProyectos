package com.crud.personal.personal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.personal.personal.models.Proyecto;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long>{

    
}
