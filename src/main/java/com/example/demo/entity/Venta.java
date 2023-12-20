package com.example.demo.entity;

import java.time.LocalDate;

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
@Table(name="Venta")
@Getter
@Setter
@NoArgsConstructor
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_venta;
    private String tipo_comprobante;
    private String serie_comprobante;
    private String num_comprobante;
    private LocalDate fecha_hora;
    private Double impuesto;
    private Double total_venta;
    private String estado;

    /*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "venta")
    List<DeetalleVenta> uno;*/

    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name="id_persona")
    private Persona persona;
}
