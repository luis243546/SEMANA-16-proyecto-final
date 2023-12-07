package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Categoria;
import com.example.demo.repository.CategoriaDao;

@Service
public class CategoriaServiceImpl implements CategoriaService{

    @Autowired
    CategoriaDao categoriaDao;

    @Override
    public List<Categoria> listar() {
        return (List<Categoria>) categoriaDao.findAll();
    }

    @Override
    public Categoria verUno(Long id) {
        return categoriaDao.findById(id).orElse(null);
    }

    @Override
    public Categoria registrar(Categoria categoria) {
        return categoriaDao.save(categoria);
    }

    @Override
    public Categoria actualizar(Categoria object, Long id) {
        Optional<Categoria> objectExistenteOptional = categoriaDao.findById(id);

        if (objectExistenteOptional.isPresent()) {
			Categoria categoriaExistente = objectExistenteOptional.get();

			categoriaExistente.setNombre(object.getNombre());
			categoriaExistente.setDescripcion(object.getDescripcion());
			categoriaExistente.setCondicion(object.getCondicion());

            return categoriaDao.save(categoriaExistente);
		} else {
			return null;
		}
    }

    @Override
    public void eliminar(Long id) {
        categoriaDao.deleteById(id);
    }
    
}
