package com.example.E02ejercicios_practicos.model;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Producto {
    @Id
    @GeneratedValue
    @NonNull
    private Long id;
    @NonNull
    private String nombre;
    @NonNull
    private Double precio;
    private String imagen;
    private String descripcion;

}
