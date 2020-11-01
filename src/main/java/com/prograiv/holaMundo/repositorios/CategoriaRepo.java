package com.prograiv.holaMundo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prograiv.holaMundo.entidades.Categoria;

public interface CategoriaRepo extends JpaRepository<Categoria, Long> {

}
