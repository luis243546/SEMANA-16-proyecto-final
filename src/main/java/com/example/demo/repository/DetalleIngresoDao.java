package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.DetalleIngreso;

public interface DetalleIngresoDao extends CrudRepository<DetalleIngreso, Long>{
    
}
