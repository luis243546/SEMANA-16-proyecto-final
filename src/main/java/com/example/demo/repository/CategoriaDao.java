package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Categoria;

public interface CategoriaDao extends CrudRepository<Categoria, Long>{
    
}
