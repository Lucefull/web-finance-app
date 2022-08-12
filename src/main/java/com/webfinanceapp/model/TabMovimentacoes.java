package com.webfinanceapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tabMovimentos", schema = "webFinanceApp", catalog = "webFinanceApp")
public class TabMovimentacoes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMov;
}
