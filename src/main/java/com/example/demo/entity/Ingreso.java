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
@Table(name="ingreso")
@Getter
@Setter
@NoArgsConstructor
public class Ingreso extends BaseEntity{
    
    private String tipo_comprobante;
    private String serie_comprobante;
    private String num_comprobante;
    private LocalDate fecha_hora;
    private Double impuesto;
    private String estado;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "ingreso")

    List<DetalleIngreso> tres;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name="id_persona")
    
    private Persona persona;
}
