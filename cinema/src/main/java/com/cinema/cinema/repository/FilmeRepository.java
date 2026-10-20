package com.cinema.cinema.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cinema.cinema.entity.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long> {
    

    List<Filme> findByTituloFilmeContainingIgnoreCase(String tituloFilme);

}
