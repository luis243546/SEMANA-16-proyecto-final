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
import com.example.demo.entity.Persona;
import com.example.demo.service.PersonaService;

@RestController
public class PersonaController {
    
    @Autowired
    PersonaService personaService;

    @GetMapping("/lista5")
	public List<Persona> verTodo() {
		return personaService.listar();
	}

	@GetMapping("/lista5/{id}")
	public Persona verUno(@PathVariable Long id) {
		return personaService.verUno(id);
	}

	@PostMapping("/registrar5")
	public Persona registar(@RequestBody Persona persona){
		return personaService.registrar(persona);
	}

	@PutMapping("/actualizar5/{id}")
	public Persona actualizar(@RequestBody Persona persona, @PathVariable Long id){
		return personaService.actualizar(persona,id);
	}

	@DeleteMapping("/eliminar5/{id}")
	public void eliminar(@PathVariable Long id){
		personaService.eliminar(id);
	}
}
