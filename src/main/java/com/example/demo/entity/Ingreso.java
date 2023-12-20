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
@Table(name="ingreso")
@Getter
@Setter
@NoArgsConstructor
public class Ingreso {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_ingreso;
    private String tipo_comprobante;
    private String serie_comprobante;
    private String num_comprobante;
    private LocalDate fecha_hora;
    private Double impuesto;
    private String estado;
    private Double importe;

    /*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "ingreso")

    List<DetalleIngreso> tres;*/

    @ManyToOne
    @JoinColumn(name="id_persona")
    
    private Persona persona;
}
