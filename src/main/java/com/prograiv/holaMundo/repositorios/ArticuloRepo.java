package com.prograiv.holaMundo.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prograiv.holaMundo.entidades.Articulo;

public interface ArticuloRepo extends JpaRepository<Articulo, Long> {

}
