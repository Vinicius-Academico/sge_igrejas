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
public class ContatoMembro {

    private Integer id;
    private Membro membro;
    private String telefoneContato;
    private String telefoneWhatsapp;
    private String email;
    private String outroContato;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;

    public ContatoMembro() {
    }

    public ContatoMembro(Integer id, Membro membro, String telefoneContato, String telefoneWhatsapp, String email, String outroContato, LocalDateTime criadoEm, LocalDateTime atualizadoEm) {
        this.id = id;
        this.membro = membro;
        this.telefoneContato = telefoneContato;
        this.telefoneWhatsapp = telefoneWhatsapp;
        this.email = email;
        this.outroContato = outroContato;
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

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getTelefoneWhatsapp() {
        return telefoneWhatsapp;
    }

    public void setTelefoneWhatsapp(String telefoneWhatsapp) {
        this.telefoneWhatsapp = telefoneWhatsapp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOutroContato() {
        return outroContato;
    }

    public void setOutroContato(String outroContato) {
        this.outroContato = outroContato;
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
