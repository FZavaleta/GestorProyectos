package com.crud.personal.personal.models;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "proyecto")
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre",nullable = false)
    private String nombre;

    @Column(name = "tipo",nullable = false)
    private String tipo;

    @Column(name = "descripcion", nullable = true)
    private String descripcion;

    @Column(name = "completado", nullable = false)
    private String completado;

    @Column(name = "fecha_entrega",nullable = true)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate fechaEntrega;

    public Proyecto(){
    }

    public Proyecto(Long id, String nombre, String tipo, LocalDate fechaEntrega) {
        this.id = id;
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaEntrega = fechaEntrega;
    }


    public Proyecto(String nombre, String tipo, LocalDate fechaEntrega, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.fechaEntrega = fechaEntrega;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getCompletado(){
        return completado;
    }

    public void setCompletado(String completado){
        this.completado = completado;
    }

    public LocalDate getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(LocalDate fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    @Override
    public String toString() {
        return "Proyecto [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", fechaEntrega=" + fechaEntrega + "]";
    }

    
    
}
