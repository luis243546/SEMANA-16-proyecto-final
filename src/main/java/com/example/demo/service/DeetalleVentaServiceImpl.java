package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DeetalleVenta;
import com.example.demo.repository.DeetalleVentaDao;

@Service
public class DeetalleVentaServiceImpl implements DeetalleVentaService{

    @Autowired
    DeetalleVentaDao deetalleVentaDao;

    @Override
    public List<DeetalleVenta> listar() {
        return (List<DeetalleVenta>) deetalleVentaDao.findAll();
    }

    @Override
    public DeetalleVenta verUno(Long id) {
        return deetalleVentaDao.findById(id).orElse(null);
    }

    @Override
    public DeetalleVenta registrar(DeetalleVenta deetalleVenta) {
        return deetalleVentaDao.save(deetalleVenta);
    }

    @Override
    public DeetalleVenta actualizar(DeetalleVenta object, Long id) {
        Optional<DeetalleVenta> objectExistenteOptional = deetalleVentaDao.findById(id);

        if (objectExistenteOptional.isPresent()) {
			DeetalleVenta categoriadeetalleventaExistente = objectExistenteOptional.get();

			categoriadeetalleventaExistente.setCantidad(object.getCantidad());
			categoriadeetalleventaExistente.setPrecio_venta(object.getPrecio_venta());
			categoriadeetalleventaExistente.setDescuento(object.getDescuento());

            return deetalleVentaDao.save(categoriadeetalleventaExistente);
		} else {
			return null;
		}
    }

    @Override
    public void eliminar(Long id) {
        deetalleVentaDao.deleteById(id);
    }
    
}
