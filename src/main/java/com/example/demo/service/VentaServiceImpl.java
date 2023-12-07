package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Venta;
import com.example.demo.repository.VentaDao;

@Service
public class VentaServiceImpl implements VentaService{
    
    @Autowired
    VentaDao ventaDao;

    @Override
    public List<Venta> listar() {
        return (List<Venta>) ventaDao.findAll();
    }

    @Override
    public Venta verUno(Long id) {
        return ventaDao.findById(id).orElse(null);
    }

    @Override
    public Venta registrar(Venta venta) {
        return ventaDao.save(venta);
    }

    @Override
    public Venta actualizar(Venta object, Long id) {
        Optional<Venta> objectExisteOptional = ventaDao.findById(id);

        if (objectExisteOptional.isPresent()) {
            Venta ventaExistente = objectExisteOptional.get();

            ventaExistente.setTipo_comprobante(object.getTipo_comprobante());
            ventaExistente.setSerie_comprobante(object.getSerie_comprobante());
            ventaExistente.setNum_comprobante(object.getNum_comprobante());
            ventaExistente.setFecha_hora(object.getFecha_hora());
            ventaExistente.setImpuesto(object.getImpuesto());
            ventaExistente.setTotal_venta(object.getTotal_venta());
            ventaExistente.setEstado(object.getEstado());

            return ventaDao.save(ventaExistente);
        } else {
            return null;
        }
    }

    @Override
    public void eliminar(Long id) {
        ventaDao.deleteById(id);
    }
}
