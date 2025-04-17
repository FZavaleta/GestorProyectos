package com.crud.personal.personal;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crud.personal.personal.models.Proyecto;
import com.crud.personal.personal.repositories.ProyectoRepository;

@SpringBootApplication
public class PersonalApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PersonalApplication.class, args);
	}

	@Autowired
	private ProyectoRepository repository;

	@Override
	public void run (String...args) throws Exception{
		/*Proyecto proyecto_1 = new Proyecto("Departamento Humberto", "Arquitectura",  LocalDate.of(2025,03,20));
		repository.save(proyecto_1);
		Proyecto proyecto_2 = new Proyecto("Desarrollo de CRUD basico", "Progrmacion",  LocalDate.of(2025,01,02));
		repository.save(proyecto_2);
		Proyecto proyecto_3 = new Proyecto("Gestion de Municipalidad", "Gestion",  LocalDate.of(2024,12,20));
		repository.save(proyecto_3);*/
	}

}
