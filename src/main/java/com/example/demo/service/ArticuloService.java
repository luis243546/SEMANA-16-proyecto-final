package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Articulo;

@Service
public interface ArticuloService {

    public List<Articulo> listar();
	
	public Articulo verUno(Long id);

    public Articulo registrar(Articulo articulo);

    public Articulo actualizar(Articulo articulo, Long id);

    public void eliminar(Long id);
    
}
