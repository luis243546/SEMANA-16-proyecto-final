package com.example.demo.entity;

import java.util.List;

import com.example.demo.shared.BaseEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="articulo")
@Getter
@Setter
@NoArgsConstructor
public class Articulo extends BaseEntity{
    private String codigo;
    private String nombre;
    private int stock;
    private String descripcion;
    private String imagen;
    private String estado;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="id_categoria")
    
    private Categoria categoria;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "articulo")

    List<DetalleIngreso> dos;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "articulo")

    List<DeetalleVenta> cuatro;
}
