package com.sge.igrejas.entities;

import java.time.LocalDate;
import java.time.LocalTime;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "evento")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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

    @PrePersist
    protected void onCreate() {
        if (this.concluido == null) {
            this.concluido = false;
        }
    }
}
