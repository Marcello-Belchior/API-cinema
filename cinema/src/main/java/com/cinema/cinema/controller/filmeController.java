package com.cinema.cinema.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinema.cinema.entity.Filme;
import com.cinema.cinema.service.FilmeService;

@RestController
@RequestMapping("/api/filmes")
public class filmeController {

    private final FilmeService filmeService;

    public filmeController(FilmeService filmeService){
        this.filmeService = filmeService;
    }

    @PostMapping
    public Filme salvar(@RequestBody Filme filme){
        return filmeService.salvar(filme);
    }
    
    @GetMapping
    public List<Filme> buscarTodos(){
        return filmeService.buscarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Filme> buscarPorId(@PathVariable Long id){
        Filme filme = filmeService.buscarPorId(id);
        return ResponseEntity.ok(filme);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Filme> atualizar(
        @PathVariable Long id,
        @RequestBody Filme filme){
            filme.setIdFilme(id);
            return ResponseEntity.ok(filme);
        }

        @DeleteMapping("/{id")
        public ResponseEntity<Void> deletar(@PathVariable Long id){
            filmeService.deletarFilme(id);
            return ResponseEntity.noContent().build();
        }
}
