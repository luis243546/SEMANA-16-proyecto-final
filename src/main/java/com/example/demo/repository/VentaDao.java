package com.example.demo.repository;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Venta;

public interface VentaDao extends CrudRepository<Venta, Long>{
    
}
