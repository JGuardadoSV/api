package com.prograiv.holaMundo.repositorios;

import org.springframework.stereotype.Repository;

import com.prograiv.holaMundo.entidades.Persona;

// Podemos crear muchos repositorios para cada entidad
// CRUD 


@Repository
public class PersonaRepository {
	
	public Persona ConsultarUna(int id) {
		
		return new Persona(1,"Juan Perez");
		
	}

}
