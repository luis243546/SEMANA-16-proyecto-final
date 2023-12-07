package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Categoria;



@Service
public interface CategoriaService {
    public List<Categoria> listar();
	
	public Categoria verUno(Long id);

    public Categoria registrar(Categoria categoria);

    public Categoria actualizar(Categoria categoria, Long id);

    public void eliminar(Long id);
}
