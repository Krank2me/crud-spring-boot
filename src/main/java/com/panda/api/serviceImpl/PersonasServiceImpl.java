package com.panda.api.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.panda.api.domain.Persona;
import com.panda.api.repository.PersonasRepository;
import com.panda.api.service.PersonasService;

@Service
public class PersonasServiceImpl implements PersonasService {
	
	@Autowired
	private PersonasRepository personasRepository;

	@Override
	public List<Persona> listar() {
		return (List<Persona>) personasRepository.findAll();
	}

	@Override
	public Persona listarById(Long id) {
		return personasRepository.findById(id).get();
	}

	@Override
	public Persona crear(Persona persona) {
		return personasRepository.save(persona);
	}

	@Override
	public Persona eliminar(Long id) {
		Persona persona = null;
		
		try {
			persona = new Persona();
			persona.setId(id);
			personasRepository.deleteById(id);	
		} catch (Exception e) {
			System.out.println("****** Ocurrio un error eliminando la persona con id: " + id + " error: " + e.getMessage());
		}
		
		return persona;
	}

	@Override
	public Persona editar(Persona persona) {
		return personasRepository.save(persona);
	}

}
