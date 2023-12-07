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
import com.example.demo.entity.DetalleIngreso;
import com.example.demo.service.DetalleIngresoService;

@RestController
public class DetalleIngresoController {
    
    @Autowired
    DetalleIngresoService detalleIngresoService;

    @GetMapping("/lista3")
	public List<DetalleIngreso> verTodo() {
		return detalleIngresoService.listar();
	}

	@GetMapping("/lista3/{id}")
	public DetalleIngreso verUno(@PathVariable Long id) {
		return detalleIngresoService.verUno(id);
	}

	@PostMapping("/registrar3")
	public DetalleIngreso registar(@RequestBody DetalleIngreso detalleIngreso){
		return detalleIngresoService.registrar(detalleIngreso);
	}

	@PutMapping("/actualizar3/{id}")
	public DetalleIngreso actualizar(@RequestBody DetalleIngreso detalleIngreso, @PathVariable Long id){
		return detalleIngresoService.actualizar(detalleIngreso,id);
	}

	@DeleteMapping("/eliminar3/{id}")
	public void eliminar(@PathVariable Long id){
		detalleIngresoService.eliminar(id);
	}
}
