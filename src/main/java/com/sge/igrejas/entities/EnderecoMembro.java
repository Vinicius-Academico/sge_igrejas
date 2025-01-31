/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sge.igrejas.entities;

import java.time.LocalDateTime;

/**
 *
 * @author Administrador
 */
public class EnderecoMembro {

    private Integer id;
    private Membro membro;
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String referencia;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;

    public EnderecoMembro() {
    }

    public EnderecoMembro(Integer id, Membro membro, String rua, String numero, String bairro, String cidade, String estado, String referencia, LocalDateTime criadoEm, LocalDateTime atualizadoEm) {
        this.id = id;
        this.membro = membro;
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.referencia = referencia;
        this.criadoEm = criadoEm;
        this.atualizadoEm = atualizadoEm;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Membro getMembro() {
        return membro;
    }

    public void setMembro(Membro membro) {
        this.membro = membro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
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
    

}
