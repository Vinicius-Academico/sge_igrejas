package com.sge.igrejas.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "contato_membro")  
public class ContatoMembro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "membro_id", nullable = false)
    private Membro membro;

    @Column(name = "telefone_contato", length = 20)
    private String telefoneContato;

    @Column(name = "telefone_whatsapp", length = 20)
    private String telefoneWhatsapp;

    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "outro_contato", length = 100)
    private String outroContato;

    @Column(name = "criado_em", updatable = false)
    private LocalDateTime criadoEm;

    @Column(name = "atualizado_em")
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

    @PrePersist
    protected void onCreate() {
        this.criadoEm = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.atualizadoEm = LocalDateTime.now();
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

    public LocalDateTime getAtualizadoEm() {
        return atualizadoEm;
    }
}
