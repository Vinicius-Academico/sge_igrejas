package com.sge.igrejas.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FinanceiroDTO {

    private Integer idFinanceiro;
    private Integer eventoId; // Apenas o ID do evento, para evitar carregar a entidade inteira
    private String descricao;
    private String tipoTransacao;
    private BigDecimal valor;
    private LocalDate dataTransacao;
    private String fornecedor;

    public FinanceiroDTO() {
    }

    public FinanceiroDTO(Integer idFinanceiro, Integer eventoId, String descricao, String tipoTransacao, BigDecimal valor, LocalDate dataTransacao, String fornecedor) {
        this.idFinanceiro = idFinanceiro;
        this.eventoId = eventoId;
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

    public Integer getEventoId() {
        return eventoId;
    }

    public void setEventoId(Integer eventoId) {
        this.eventoId = eventoId;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(String tipoTransacao) {
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
