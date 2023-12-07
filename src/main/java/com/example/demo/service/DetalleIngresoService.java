package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.DetalleIngreso;


@Service
public interface DetalleIngresoService {
    
    public List<DetalleIngreso> listar();
	
	public DetalleIngreso verUno(Long id);

    public DetalleIngreso registrar(DetalleIngreso detalleIngreso);

    public DetalleIngreso actualizar(DetalleIngreso detalleIngreso, Long id);

    public void eliminar(Long id);
}
