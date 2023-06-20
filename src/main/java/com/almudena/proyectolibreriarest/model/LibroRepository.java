package com.almudena.proyectolibreriarest.model;

import org.springframework.data.repository.CrudRepository;
import com.almudena.proyectolibreriarest.entities.Libro;


public interface LibroRepository extends CrudRepository<Libro, Integer>{

}
