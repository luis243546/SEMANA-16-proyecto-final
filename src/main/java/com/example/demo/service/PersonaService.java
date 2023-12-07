package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Persona;


@Service
public interface PersonaService {
    public List<Persona> listar();
	
	public Persona verUno(Long id);

    public Persona registrar(Persona persona);

    public Persona actualizar(Persona Persona, Long id);

    public void eliminar(Long id);
}
