package com.example.demo.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Ingreso;


public interface IngresoDao extends CrudRepository<Ingreso, Long>{
    
}
