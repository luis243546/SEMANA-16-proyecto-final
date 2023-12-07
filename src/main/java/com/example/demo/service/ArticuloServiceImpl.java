package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Articulo;
import com.example.demo.repository.ArticuloDao;
@Service
public class ArticuloServiceImpl implements ArticuloService{

    @Autowired
    ArticuloDao articuloDao;

    @Override
    public List<Articulo> listar() {
       return (List<Articulo>) articuloDao.findAll();
    }

    @Override
    public Articulo verUno(Long id) {
        return articuloDao.findById(id).orElse(null);
    }

    @Override
    public Articulo registrar(Articulo articulo) {
        return articuloDao.save(articulo);
    }

    @Override
    public Articulo actualizar(Articulo object, Long id) {
        Optional<Articulo> objectExistenteOptional = articuloDao.findById(id);

        if (objectExistenteOptional.isPresent()) {
			Articulo articuloExistente = objectExistenteOptional.get();

			articuloExistente.setCodigo(object.getCodigo());
			articuloExistente.setNombre(object.getNombre());
			articuloExistente.setStock(object.getStock());
			articuloExistente.setDescripcion(object.getDescripcion());
			articuloExistente.setImagen(object.getImagen());
            articuloExistente.setEstado(object.getEstado());

            return articuloDao.save(articuloExistente);
		} else {
			return null;
		}
    }

    @Override
    public void eliminar(Long id) {
        articuloDao.deleteById(id);
    }
    
}
