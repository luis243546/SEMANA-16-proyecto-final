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

import com.example.demo.entity.DeetalleVenta;
import com.example.demo.service.DeetalleVentaService;

@RestController
public class DeetalleVentaController {
    
    @Autowired
    DeetalleVentaService deetalleVentaService;

    @GetMapping("/lista2")
	public List<DeetalleVenta> verTodo() {
		return deetalleVentaService.listar();
	}

	@GetMapping("/lista2/{id}")
	public DeetalleVenta verUno(@PathVariable Long id) {
		return deetalleVentaService.verUno(id);
	}

	@PostMapping("/registrar2")
	public DeetalleVenta registar(@RequestBody DeetalleVenta deetalleVenta){
		return deetalleVentaService.registrar(deetalleVenta);
	}

	@PutMapping("/actualizar2/{id}")
	public DeetalleVenta actualizar(@RequestBody DeetalleVenta deetalleVenta, @PathVariable Long id){
		return deetalleVentaService.actualizar(deetalleVenta,id);
	}

	@DeleteMapping("/eliminar2/{id}")
	public void eliminar(@PathVariable Long id){
		deetalleVentaService.eliminar(id);
	}
}
