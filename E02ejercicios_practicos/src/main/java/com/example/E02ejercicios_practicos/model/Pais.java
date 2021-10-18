package com.example.E02ejercicios_practicos.model;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "country")
public class Pais implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private Long id;

    @Column(length = 128, name = "name", nullable = true)
    private String nombre;


}