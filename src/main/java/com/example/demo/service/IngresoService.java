package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Ingreso;


@Service
public interface IngresoService {

    public List<Ingreso> listar();
	
	public Ingreso verUno(Long id);

    public Ingreso registrar(Ingreso ingreso);

    public Ingreso actualizar(Ingreso ingreso, Long id);

    public void eliminar(Long id);
    
}
