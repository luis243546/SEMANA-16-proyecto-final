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
import com.example.demo.entity.Ingreso;
import com.example.demo.service.IngresoService;

@RestController
public class IngresoController {
    
    @Autowired
    IngresoService ingresoService;

    @GetMapping("/lista4")
	public List<Ingreso> verTodo() {
		return ingresoService.listar();
	}

	@GetMapping("/lista4/{id}")
	public Ingreso verUno(@PathVariable Long id) {
		return ingresoService.verUno(id);
	}

	@PostMapping("/registrar4")
	public Ingreso registar(@RequestBody Ingreso ingreso){
		return ingresoService.registrar(ingreso);
	}

	@PutMapping("/actualizar4/{id}")
	public Ingreso actualizar(@RequestBody Ingreso ingreso, @PathVariable Long id){
		return ingresoService.actualizar(ingreso,id);
	}

	@DeleteMapping("/eliminar4/{id}")
	public void eliminar(@PathVariable Long id){
		ingresoService.eliminar(id);
	}
}
