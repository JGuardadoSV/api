package com.prograiv.holaMundo.entidades;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categoria {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idCategoria;
	
	private String NombreCategoria;
	
	@OneToMany(mappedBy="categoria",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Articulo> articulo;

	public Categoria(long idCategoria, String nombreCategoria) {
		this.idCategoria = idCategoria;
		NombreCategoria = nombreCategoria;
	}
	
	public Categoria(String nombreCategoria) {
		
		NombreCategoria = nombreCategoria;
	}

	public Categoria() {
	}

	public long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNombreCategoria() {
		return NombreCategoria;
	}

	public void setNombreCategoria(String nombreCategoria) {
		NombreCategoria = nombreCategoria;
	}

	public List<Articulo> getArticulo() {
		return articulo;
	}

	public void setArticulo(List<Articulo> articulo) {
		this.articulo = articulo;
	}
	
	
	
	

}
