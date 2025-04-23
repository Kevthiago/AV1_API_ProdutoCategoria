package com.prova.av1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.prova.av1.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
    
}
