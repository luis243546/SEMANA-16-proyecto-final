package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Ingreso;
import com.example.demo.repository.IngresoDao;

@Service
public class IngresoServiceImpl implements IngresoService{

    @Autowired
    IngresoDao ingresoDao;


    @Override
    public List<Ingreso> listar() {
        return (List<Ingreso>) ingresoDao.findAll();
    }

    @Override
    public Ingreso verUno(Long id) {
        return ingresoDao.findById(id).orElse(null);
    }

    @Override
    public Ingreso registrar(Ingreso ingreso) {
        return ingresoDao.save(ingreso);
    }

    @Override
    public Ingreso actualizar(Ingreso object, Long id) {
        Optional<Ingreso> objectExistenteOptional = ingresoDao.findById(id);

        if (objectExistenteOptional.isPresent()) {
			Ingreso ingresoExistente = objectExistenteOptional.get();

			ingresoExistente.setTipo_comprobante(object.getTipo_comprobante());
			ingresoExistente.setSerie_comprobante(object.getSerie_comprobante());
			ingresoExistente.setNum_comprobante(object.getNum_comprobante());
            ingresoExistente.setFecha_hora(object.getFecha_hora());
            ingresoExistente.setImpuesto(object.getImpuesto());
            ingresoExistente.setEstado(object.getEstado());

            return ingresoDao.save(ingresoExistente);
		} else {
			return null;
		}
    }

    @Override
    public void eliminar(Long id) {
        ingresoDao.deleteById(id);
    }
    
}
