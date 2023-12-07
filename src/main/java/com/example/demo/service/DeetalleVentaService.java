package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.DeetalleVenta;


@Service
public interface DeetalleVentaService {
    public List<DeetalleVenta> listar();
	
	public DeetalleVenta verUno(Long id);

    public DeetalleVenta registrar(DeetalleVenta deetalleVenta);

    public DeetalleVenta actualizar(DeetalleVenta deetalleVenta, Long id);

    public void eliminar(Long id);
}
