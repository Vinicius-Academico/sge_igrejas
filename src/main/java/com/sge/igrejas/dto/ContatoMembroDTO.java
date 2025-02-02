package com.sge.igrejas.dto;

import java.time.LocalDateTime;

public class ContatoMembroDTO {

    private Integer id;
    private Integer membroId; 
    private String telefoneContato;
    private String telefoneWhatsapp;
    private String email;
    private String outroContato;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;

    public ContatoMembroDTO() {
    }

    public ContatoMembroDTO(Integer id, Integer membroId, String telefoneContato, String telefoneWhatsapp, String email, String outroContato, LocalDateTime criadoEm, LocalDateTime atualizadoEm) {
        this.id = id;
        this.membroId = membroId;
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

    public Integer getMembroId() {
        return membroId;
    }

    public void setMembroId(Integer membroId) {
        this.membroId = membroId;
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
