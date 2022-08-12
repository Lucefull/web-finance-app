package com.webfinanceapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webfinanceapp.service.FinanceService;

@RestController
@RequestMapping("/finance")
public class FinanceController {
    @Autowired
    private FinanceService serviceFinance;

    @PostMapping("/")
    public void newLancamento() {

    }
}
