/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sge.igrejas.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author Administrador
 */
public class Financeiro {

    private Integer idFinanceiro;
    private Evento evento;
    private String descricao;
    private TipoTransacao tipoTransacao;
    private BigDecimal valor;
    private LocalDate dataTransacao;
    private String fornecedor;

    public enum TipoTransacao {
        Faturamento, Compra
    }

    public Financeiro() {
    }

    public Financeiro(Integer idFinanceiro, Evento evento, String descricao, TipoTransacao tipoTransacao, BigDecimal valor, LocalDate dataTransacao, String fornecedor) {
        this.idFinanceiro = idFinanceiro;
        this.evento = evento;
        this.descricao = descricao;
        this.tipoTransacao = tipoTransacao;
        this.valor = valor;
        this.dataTransacao = dataTransacao;
        this.fornecedor = fornecedor;
    }

    public Integer getIdFinanceiro() {
        return idFinanceiro;
    }

    public void setIdFinanceiro(Integer idFinanceiro) {
        this.idFinanceiro = idFinanceiro;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(TipoTransacao tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getDataTransacao() {
        return dataTransacao;
    }

    public void setDataTransacao(LocalDate dataTransacao) {
        this.dataTransacao = dataTransacao;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }
    
    
    
}
