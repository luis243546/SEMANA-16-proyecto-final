package com.example.demo.entity;

/*import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;*/

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="categoria")
@Getter 
@Setter 
@NoArgsConstructor

/*@JsonIdentityInfo(
    generator = ObjectIdGenerators.PropertyGenerator.class,
    property = "id"
)*/
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_categoria;
    private String nombre;
    private String descripcion;
    private Boolean condicion;


    /*@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "categoria")
    /*@JsonManagedReference*/
    /*private List<Articulo> articulos;*/
}
