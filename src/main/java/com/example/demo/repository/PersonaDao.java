package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Persona;

public interface PersonaDao extends CrudRepository<Persona, Long>{
    
}
