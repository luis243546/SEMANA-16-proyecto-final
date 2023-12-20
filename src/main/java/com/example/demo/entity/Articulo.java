package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="articulo")
@Getter
@Setter
@NoArgsConstructor
public class Articulo{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_articulo;
    private String codigo;
    private String nombre;
    private int stock;
    private String descripcion;
    private String imagen;
    private String estado;

    // aqui se espera un fk de la tabla categoria
    @ManyToOne
    @JoinColumn(name="fk_categoria")
    private Categoria categoria;

    // aqui se genera una lista de la tabla detalle_ingreso 
    //@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "articulo")
    //List<DetalleIngreso> dos;

    // aqui se genera una lista de la tabla detalle_venta 
    //@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "articulo")
    //List<DeetalleVenta> cuatro;
}
