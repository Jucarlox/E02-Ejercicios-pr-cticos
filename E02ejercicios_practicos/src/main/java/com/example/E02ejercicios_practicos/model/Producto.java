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

    private Long id;
    @NonNull
    @Column(name = "name")
    private String nombre;
    @NonNull
    @Column(name = "price")
    private Double precio;
    @Column(name = "image")
    private String imagen;
    @Column(name = "description")
    private String descripcion;

}
