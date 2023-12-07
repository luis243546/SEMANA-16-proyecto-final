package com.example.demo.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Articulo;


public interface ArticuloDao extends CrudRepository<Articulo, Long>{
    
}
