package com.example.E02ejercicios_practicos.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;




@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "product")
public class Producto implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Integer id;
    @Column(name = "name", nullable = false, length = 255)
    private String nombre;

    @Column(name = "price", nullable = false)
    private Double precio;
    @Column(name = "image")
    private String imagen;
    @Column(name = "description")
    private String descripcion;

}
