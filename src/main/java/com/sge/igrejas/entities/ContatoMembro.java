package com.sge.igrejas.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "contato_membro")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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

    @PrePersist
    protected void onCreate() {
        this.criadoEm = LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate() {
        this.atualizadoEm = LocalDateTime.now();
    }
}
