/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sge.igrejas.entities;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Administrador
 */
public class Evento {
    private Integer id;
    private String nomeEvento;  
    private String descricao;
    private String local;
    private LocalDate dataEvento;
    private LocalTime horario;
    private Membro responsavel;
    private Boolean concluido;

    public Evento() {
    }

    public Evento(Integer id, String nomeEvento, String descricao, String local, LocalDate dataEvento, LocalTime horario, Membro responsavel, Boolean concluido) {
        this.id = id;
        this.nomeEvento = nomeEvento;
        this.descricao = descricao;
        this.local = local;
        this.dataEvento = dataEvento;
        this.horario = horario;
        this.responsavel = responsavel;
        this.concluido = concluido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public Membro getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Membro responsavel) {
        this.responsavel = responsavel;
    }

    public Boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }
    
    
}
