package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Categoria;
import com.example.demo.service.CategoriaService;

@RestController
public class CategoriaController {
    @Autowired
    CategoriaService categoriaService;

    @GetMapping("/lista1")
	public List<Categoria> verTodo() {
		return categoriaService.listar();
	}

	@GetMapping("/lista1/{id}")
	public Categoria verUno(@PathVariable Long id) {
		return categoriaService.verUno(id);
	}

	@PostMapping("/registrar1")
	public Categoria registar(@RequestBody Categoria categoria){
		return categoriaService.registrar(categoria);
	}

	@PutMapping("/actualizar1/{id}")
	public Categoria actualizar(@RequestBody Categoria categoria, @PathVariable Long id){
		return categoriaService.actualizar(categoria,id);
	}

	@DeleteMapping("/eliminar1/{id}")
	public void eliminar(@PathVariable Long id){
		categoriaService.eliminar(id);
	}
}
