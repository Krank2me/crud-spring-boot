package com.panda.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.panda.api.domain.Persona;

@Repository
public interface PersonasRepository extends CrudRepository<Persona, Long> {
	
	
}
