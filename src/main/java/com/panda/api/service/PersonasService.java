package com.panda.api.service;

import java.util.List;

import com.panda.api.domain.Persona;

public interface PersonasService {
	
	List<Persona> listar();
	Persona listarById(Long id);
	Persona crear(Persona persona);
	Persona eliminar(Long id);
	Persona editar(Persona persona);

}
