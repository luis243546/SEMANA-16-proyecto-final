package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.demo.entity.Venta;

@Service
public interface VentaService {
    public List<Venta> listar();
	
	public Venta verUno(Long id);

    public Venta registrar(Venta venta);

    public Venta actualizar(Venta venta, Long id);

    public void eliminar(Long id);
}
