package com.sge.igrejas.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Membro {

    private Integer id;
    private Boolean isAtivo;
    private String nome;
    private String rg;
    private String cpf;
    private String estadoCivil;
    private String profissao;
    private String nivelEducacional;
    private LocalDate dataNascimento;
    private LocalDate dataAdmissao;
    private LocalDate dataBatismo;
    private String observacao;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;
    private Integer genero;

    public Membro() {
    }

    public Membro(Integer id, Boolean isAtivo, String nome, String rg, String cpf, String estadoCivil, String profissao, String nivelEducacional, LocalDate dataNascimento, LocalDate dataAdmissao, LocalDate dataBatismo, String observacao, LocalDateTime criadoEm, LocalDateTime atualizadoEm, Integer genero) {
        this.id = id;
        this.isAtivo = isAtivo;
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
        this.nivelEducacional = nivelEducacional;
        this.dataNascimento = dataNascimento;
        this.dataAdmissao = dataAdmissao;
        this.dataBatismo = dataBatismo;
        this.observacao = observacao;
        this.criadoEm = criadoEm;
        this.atualizadoEm = atualizadoEm;
        this.genero = genero;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsAtivo() {
        return isAtivo;
    }

    public void setIsAtivo(Boolean isAtivo) {
        this.isAtivo = isAtivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNivelEducacional() {
        return nivelEducacional;
    }

    public void setNivelEducacional(String nivelEducacional) {
        this.nivelEducacional = nivelEducacional;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public LocalDate getDataBatismo() {
        return dataBatismo;
    }

    public void setDataBatismo(LocalDate dataBatismo) {
        this.dataBatismo = dataBatismo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }

    public LocalDateTime getAtualizadoEm() {
        return atualizadoEm;
    }

    public void setAtualizadoEm(LocalDateTime atualizadoEm) {
        this.atualizadoEm = atualizadoEm;
    }

    public Integer getGenero() {
        return genero;
    }

    public void setGenero(Integer genero) {
        this.genero = genero;
    }
    
    
    

}
