package com.webfinanceapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webfinanceapp.repository.IMovimentosRepository;

@Service
public class FinanceService {
    @Autowired
    private IMovimentosRepository movimentosRepository;

    public void newMovimento(){
        
    }
}
