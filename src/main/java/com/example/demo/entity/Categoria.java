package com.example.demo.entity;

import java.util.List;

import com.example.demo.shared.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="categoria")
@Getter 
@Setter 
@NoArgsConstructor
public class Categoria extends BaseEntity{
    private String nombre;
    private String descripcion;
    private Boolean condicion;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "categoria")

    List<Articulo> uno;
}
