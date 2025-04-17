package com.crud.personal.personal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.personal.personal.models.Proyecto;
import com.crud.personal.personal.repositories.ProyectoRepository;


@Service
public class ProyectoServiceImpl implements ProyectoService{
    @Autowired
    private ProyectoRepository repository;

    @Override
    public List<Proyecto> listAllProyectos() {
       return repository.findAll();
    }

    @Override
    public Proyecto agregarProyecto(Proyecto proyecto) {
        return repository.save(proyecto);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Proyecto actualizarProyecto(Proyecto proyecto) {
        return repository.save(proyecto);
    }

    @Override
    public void eliminarProyecto(Long id) {
       repository.deleteById(id);
    }
}
