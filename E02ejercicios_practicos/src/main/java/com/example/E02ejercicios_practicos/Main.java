package com.example.E02ejercicios_practicos;

import com.example.E02ejercicios_practicos.model.Pais;
import com.example.E02ejercicios_practicos.model.Producto;
import com.example.E02ejercicios_practicos.repository.PaisRepository;
import com.example.E02ejercicios_practicos.repository.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@RequiredArgsConstructor
public class Main {

    private final ProductoRepository repositoryproducto;
    private final PaisRepository repositorypais;

    @PostConstruct
    public void test() {

        Producto producto1 = Producto.builder()
                .nombre("patatas fritas")
                .precio(10.0)
                .descripcion("patatas de jamon")
                .build();

        repositoryproducto.save(producto1);

        Pais pais1 = Pais.builder()
                .nombre("España")
                .build();
        Pais pais2 = Pais.builder()
                .nombre("Peru")
                .build();
        repositorypais.save(pais2);
        repositorypais.save(pais1);

        repositorypais
                .findAll()
                .forEach(System.out::println);
        repositoryproducto
                .findAll()
                .forEach(System.out::println);

    }
}
