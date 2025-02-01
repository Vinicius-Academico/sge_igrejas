package com.sge.igrejas.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.*;

@Entity
@Table(name = "evento")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @Column(name = "nome_evento", length = 100, nullable = false)
    private String nomeEvento;

    @Column(name = "descricao", length = 255)
    private String descricao;

    @Column(name = "local", length = 150, nullable = false)
    private String local;

    @Column(name = "data_evento", nullable = false)
    private LocalDate dataEvento;

    @Column(name = "horario", nullable = false)
    private LocalTime horario;

    @ManyToOne
    @JoinColumn(name = "responsavel_id", nullable = false) 
    private Membro responsavel;

    @Column(name = "concluido", nullable = false)
    private Boolean concluido = false;

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
        this.concluido = concluido != null ? concluido : false;
    }

    @PrePersist
    protected void onCreate() {
        if (this.concluido == null) {
            this.concluido = false;
        }
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
