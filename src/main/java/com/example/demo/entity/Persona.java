package com.example.demo.entity;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="persona")
@Getter
@Setter
@NoArgsConstructor
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_persona;
    @Temporal(TemporalType.DATE)
    private LocalDate fecha_nacimiento;
    private String genero;
    private String nombre;
    private String tipo_documento;
    private String num_documento;
    private String direccion;
    private String telefono;
    private String email;

    /*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "persona")

    List<Venta> seis;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "persona")

    List<Ingreso> siete;*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persona that)) return false;
        return id_persona == that.id_persona;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_persona);
    }
}
