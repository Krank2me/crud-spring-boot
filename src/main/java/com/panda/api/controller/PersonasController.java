package com.panda.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.panda.api.domain.Persona;
import com.panda.api.service.PersonasService;

@RestController
@RequestMapping("/personas")
public class PersonasController {
	
	@Autowired
	PersonasService personasService;
	
	@GetMapping(value = "/all")
	public List<Persona> listar() {
		return personasService.listar();
	}

	@GetMapping(value = {"/{id}"})
	public Persona listarById(@PathVariable("id") Long id) {
		return personasService.listarById(id);
	}
	
	@PostMapping(value = {"/create"})
	public Persona agregar(@RequestBody Persona persona) {
		return personasService.crear(persona);
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public Persona eliminar(@PathVariable("id") Long id) {
		return personasService.eliminar(id);
	}
	
	@PutMapping(value = "/edit/{id}")
	public Persona edita(@RequestBody Persona persona, @PathVariable("id") Long id) {
		persona.setId(id);
		return personasService.editar(persona);
	}
}
