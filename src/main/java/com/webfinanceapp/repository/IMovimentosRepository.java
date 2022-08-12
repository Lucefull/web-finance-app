package com.webfinanceapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.webfinanceapp.model.TabMovimentacoes;

public interface IMovimentosRepository extends JpaRepository< TabMovimentacoes,Long> {
    
}
