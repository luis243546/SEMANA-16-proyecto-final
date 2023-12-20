package com.example.demo.entity;


import java.util.Objects;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Usuario")
@Getter
@Setter
@NoArgsConstructor
public class Usuario {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_usuario;
    private String nombre;
    private String email;
    private String password;
    private String rol;

    /*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "usuario")
    List<Venta> cinco;*/


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario that)) return false;
        return id_usuario == that.id_usuario;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_usuario);
    }
}
