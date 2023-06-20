package com.almudena.proyectolibreriarest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.almudena.proyectolibreriarest.entities.Libro;
import com.almudena.proyectolibreriarest.model.LibroRepository;



@CrossOrigin // Para hacer peticiones desde otro servidor
@RestController // Para hacer peticiones REST
@RequestMapping("/book/") //podemos añadir aquí la barra final o en postmapping como está explicado
public class LibroController {
	
	@Autowired
	private LibroRepository libroRepository;
	
	//CREACIÓN
	@PostMapping 
	public void altaLibros(@RequestBody Libro libro) {
		libroRepository.save(libro);
	}
	

}
