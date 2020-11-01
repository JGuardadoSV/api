package com.prograiv.holaMundo.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.prograiv.holaMundo.entidades.Persona;
import com.prograiv.holaMundo.repositorios.PersonaRepo;


@RestController
public class HomeController {   
	
	@Autowired
	private PersonaRepo personaRepo;
	
		//localhost:8080/consultar
		@GetMapping("/consultar")
		@ResponseBody
		public Persona consultar() {
			return personaRepo.findById(1).get();
		}
		
		//localhost:8080/guardar
		@PostMapping("/guardar")
		@ResponseBody
		public Persona guardar(@RequestBody Persona nueva) {
			
			personaRepo.save(nueva);
			return nueva;
		}

}
