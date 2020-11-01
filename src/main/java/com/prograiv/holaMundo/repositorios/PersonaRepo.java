package com.prograiv.holaMundo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prograiv.holaMundo.entidades.Persona;

@Repository
public interface PersonaRepo extends JpaRepository<Persona, Integer> {

	
	
}
