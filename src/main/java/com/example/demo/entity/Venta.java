package com.example.demo.entity;

import java.time.LocalDate;
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
@Table(name="Venta")
@Getter
@Setter
@NoArgsConstructor
public class Venta extends BaseEntity{
    private String tipo_comprobante;
    private String serie_comprobante;
    private String num_comprobante;
    private LocalDate fecha_hora;
    private Double impuesto;
    private Double total_venta;
    private String estado;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "venta")

    List<DeetalleVenta> uno;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="id_usuario")
    
    private Usuario usuario;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="id_persona")
    
    private Persona persona;
}
