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

import com.example.demo.entity.Usuario;
import com.example.demo.service.UsuarioService;

@RestController
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/lista6")
	public List<Usuario> verTodo() {
		return usuarioService.listar();
	}

	@GetMapping("/lista6/{id}")
	public Usuario verUno(@PathVariable Long id) {
		return usuarioService.verUno(id);
	}

	@PostMapping("/registrar6")
	public Usuario registar(@RequestBody Usuario usuario){
		return usuarioService.registrar(usuario);
	}

	@PutMapping("/actualizar6/{id}")
	public Usuario actualizar(@RequestBody Usuario usuario, @PathVariable Long id){
		return usuarioService.actualizar(usuario,id);
	}

	@DeleteMapping("/eliminar6/{id}")
	public void eliminar(@PathVariable Long id){
		usuarioService.eliminar(id);
	}
}
