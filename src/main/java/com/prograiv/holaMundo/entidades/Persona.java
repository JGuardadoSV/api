package com.prograiv.holaMundo.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

/*  ENTIDADES = POJO @Entity  */ 


@Entity
@Table(name="persona")
public class Persona {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Id;
	
	@Column(name="nombre", length=100)
	private String Nombre;
	
	//*************************************************************
	
	public Persona() {	}
	
	//Manipular un objeto que viene de la base de datos
	public Persona(int id, String nombre) {
		Id = id;
		Nombre = nombre;
	}
	//Creando un objeto que guardaremos en la base de datos
	public Persona(String nombre) { Nombre = nombre; }

	
	
	//*************************************************************
	// Getters & Setters
	//*************************************************************
	
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	
	//*************************************************************
	// Métodos de prepersistencia @PrePersist
	//*************************************************************
	
	
	

}
