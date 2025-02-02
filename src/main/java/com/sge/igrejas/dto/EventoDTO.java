package com.sge.igrejas.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class EventoDTO {

    private Integer id;
    private String nomeEvento;
    private String descricao;
    private String local;
    private LocalDate dataEvento;
    private LocalTime horario;
    private Integer responsavelId; // Apenas o ID do responsável (Membro)
    private Boolean concluido;

    public EventoDTO() {
    }

    public EventoDTO(Integer id, String nomeEvento, String descricao, String local, LocalDate dataEvento, LocalTime horario, Integer responsavelId, Boolean concluido) {
        this.id = id;
        this.nomeEvento = nomeEvento;
        this.descricao = descricao;
        this.local = local;
        this.dataEvento = dataEvento;
        this.horario = horario;
        this.responsavelId = responsavelId;
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

    public Integer getResponsavelId() {
        return responsavelId;
    }

    public void setResponsavelId(Integer responsavelId) {
        this.responsavelId = responsavelId;
    }

    public Boolean getConcluido() {
        return concluido;
    }

    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }
}
