package com.crud.personal.personal.services;

import java.util.List;

import com.crud.personal.personal.models.Proyecto;

public interface ProyectoService {

    public List<Proyecto> listAllProyectos();

    public Proyecto agregarProyecto(Proyecto proyecto);

    public Proyecto buscarProyecto(Long id);

    public Proyecto actualizarProyecto(Proyecto proyecto);

    public void eliminarProyecto(Long id);

} 
