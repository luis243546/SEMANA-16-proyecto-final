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

import com.example.demo.entity.Venta;
import com.example.demo.service.VentaService;

@RestController
public class VentaController {
    
    @Autowired
    VentaService ventaService;

    @GetMapping("/lista7")
	public List<Venta> verTodo() {
		return ventaService.listar();
	}

	@GetMapping("/lista7/{id}")
	public Venta verUno(@PathVariable Long id) {
		return ventaService.verUno(id);
	}

	@PostMapping("/registrar7")
	public Venta registar(@RequestBody Venta venta){
		return ventaService.registrar(venta);
	}

	@PutMapping("/actualizar7/{id}")
	public Venta actualizar(@RequestBody Venta venta, @PathVariable Long id){
		return ventaService.actualizar(venta,id);
	}

	@DeleteMapping("/eliminar7/{id}")
	public void eliminar(@PathVariable Long id){
		ventaService.eliminar(id);
	}
}
