package com.prova.av1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.prova.av1.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}
