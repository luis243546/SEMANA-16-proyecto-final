package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DetalleIngreso;
import com.example.demo.repository.DetalleIngresoDao;

@Service
public class DetalleIngresoServiceImpl implements DetalleIngresoService{

    @Autowired
    DetalleIngresoDao detalleIngresoDao;

    @Override
    public List<DetalleIngreso> listar() {
        return (List<DetalleIngreso>) detalleIngresoDao.findAll();
    }

    @Override
    public DetalleIngreso verUno(Long id) {
        return detalleIngresoDao.findById(id).orElse(null);
    }

    @Override
    public DetalleIngreso registrar(DetalleIngreso detalleIngreso) {
        return detalleIngresoDao.save(detalleIngreso);
    }

    @Override
    public DetalleIngreso actualizar(DetalleIngreso object, Long id) {
        Optional<DetalleIngreso> objectExistenteOptional = detalleIngresoDao.findById(id);

        if (objectExistenteOptional.isPresent()) {
			DetalleIngreso detalleingresoExistente = objectExistenteOptional.get();

			detalleingresoExistente.setCantidad(object.getCantidad());
			detalleingresoExistente.setPrecio_compra(object.getPrecio_compra());
			detalleingresoExistente.setPrecio_venta(object.getPrecio_venta());

            return detalleIngresoDao.save(detalleingresoExistente);
		} else {
			return null;
		}
    }

    @Override
    public void eliminar(Long id) {
        detalleIngresoDao.deleteById(id);
    }
    
}
