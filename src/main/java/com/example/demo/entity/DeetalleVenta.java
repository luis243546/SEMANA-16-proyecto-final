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
@Table(name="detalle_venta")
@Getter
@Setter
@NoArgsConstructor
public class DeetalleVenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_deetallev;
    private int cantidad;
    private Double precio_venta;
    private Double descuento;

    @ManyToOne /*(cascade = CascadeType.ALL, fetch = FetchType.LAZY)*/
    @JoinColumn(name="id_articulo")
    private Articulo articulo;

    @ManyToOne
    @JoinColumn(name="id_venta")
    private Venta venta;
}
