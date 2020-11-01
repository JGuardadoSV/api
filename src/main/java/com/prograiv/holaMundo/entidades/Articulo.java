package com.prograiv.holaMundo.entidades;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Articulo {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idArticulo; 
	
	
	private String NombreArticulo; 
	
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCategoriaFK")
	private Categoria categoria;
	
	
	

	public Articulo(long idArticulo, String nombreArticulo, Categoria categoria) {
		this.idArticulo = idArticulo;
		NombreArticulo = nombreArticulo;
		this.categoria = categoria;
	}


	public Articulo(String nombreArticulo) {
		NombreArticulo = nombreArticulo;
		
	}

	
	public Articulo() {
	}

	public long getIdArticulo() {
		return idArticulo;
	}

	public void setIdArticulo(long idArticulo) {
		this.idArticulo = idArticulo;
	}

	public String getNombreArticulo() {
		return NombreArticulo;
	}

	public void setNombreArticulo(String nombreArticulo) {
		NombreArticulo = nombreArticulo;
	}
	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
	
	public Categoria getCategoria() {
		return categoria;
	}

	
	
	

}