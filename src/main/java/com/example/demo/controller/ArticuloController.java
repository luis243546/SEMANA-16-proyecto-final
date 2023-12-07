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
import com.example.demo.entity.Articulo;
import com.example.demo.service.ArticuloService;

@RestController
public class ArticuloController {
    
	@Autowired
    ArticuloService articuloService;

    @GetMapping("/lista")
	public List<Articulo> verTodo() {
		return articuloService.listar();
	}

	@GetMapping("/lista/{id}")
	public Articulo verUno(@PathVariable Long id) {
		return articuloService.verUno(id);
	}

	@PostMapping("/registrar")
	public Articulo registar(@RequestBody Articulo personal){
		return articuloService.registrar(personal);
	}

	@PutMapping("/actualizar/{id}")
	public Articulo actualizar(@RequestBody Articulo personal, @PathVariable Long id){
		return articuloService.actualizar(personal,id);
	}

	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable Long id){
		articuloService.eliminar(id);
	}
}
