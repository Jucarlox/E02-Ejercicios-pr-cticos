package com.example.E02ejercicios_practicos.repository;

import com.example.E02ejercicios_practicos.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
