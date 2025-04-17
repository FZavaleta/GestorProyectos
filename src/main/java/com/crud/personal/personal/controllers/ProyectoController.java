package com.crud.personal.personal.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.crud.personal.personal.models.Proyecto;
import com.crud.personal.personal.services.ProyectoService;

@Controller
public class ProyectoController {
    
    @Autowired
    private ProyectoService service;

    @GetMapping({"/proyectos","/"})
    public String listarEstudiantes(Model model){
        model.addAttribute("Proyectos", service.listAllProyectos());
        return "proyectos";
    }

    @GetMapping("/proyecto/crear")
    public String crearProyectoFormulario(Model model) {
        Proyecto proyecto = new Proyecto();
        model.addAttribute("proyecto", proyecto);
        return "crearProyecto";
    }
    
    @PostMapping("/proyecto/crear/guardar")
    public String guardarProyecto(@ModelAttribute("Proyecto") Proyecto proyecto) {
        proyecto.setCompletado("pendiente");
        service.agregarProyecto(proyecto);
        return "redirect:/proyectos";
    }
    
    @GetMapping("/proyectos/editar/{id}")
    public String mostrarFormularioEditar(@PathVariable Long id, Model model) {
        model.addAttribute("proyecto", service.buscarProyecto(id));
        return "editarProyecto";
    }

    @PostMapping("/proyectos/editar/guardar/{id}")
    public String actualizarProyecto(@PathVariable Long id,@ModelAttribute("proyecto") Proyecto proyecto,Model model) {
        Proyecto proyectoExistente = service.buscarProyecto(id);
        proyectoExistente.setId(id);
        proyectoExistente.setNombre(proyecto.getNombre());
        proyectoExistente.setTipo(proyecto.getTipo());
        proyectoExistente.setDescripcion(proyecto.getDescripcion());
        proyectoExistente.setFechaEntrega(proyecto.getFechaEntrega());
        service.actualizarProyecto(proyectoExistente);
        return "redirect:/proyectos";
    }
    
    @GetMapping("/proyectoCompletado/{id}")
    public String actualizarProyectoCompletado(@PathVariable Long id) {
        Proyecto proyectoExistente = service.buscarProyecto(id);
        String value = proyectoExistente.getCompletado();
        System.out.println(value);
        if(value.equals("pendiente")){
            proyectoExistente.setCompletado("completado");
        }
        else{
            proyectoExistente.setCompletado("pendiente");
        }
        service.actualizarProyecto(proyectoExistente);
        return "redirect:/proyectos";
    }

    @GetMapping("/proyecto/eliminar/{id}")
    public String eliminarProyecto(@PathVariable Long id) {
        service.eliminarProyecto(id);
        return "redirect:/proyectos";
    }
    

}
