package com.sge.igrejas.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "membro")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Membro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "is_ativo", nullable = false)
    private Boolean isAtivo;

    @Column(name = "nome", length = 100, nullable = false)
    private String nome;

    @Column(name = "rg", length = 20)
    private String rg;

    @Column(name = "cpf", length = 14, unique = true, nullable = false)
    private String cpf;

    @Column(name = "estado_civil", length = 20)
    private String estadoCivil;

    @Column(name = "profissao", length = 50)
    private String profissao;

    @Column(name = "nivel_educacional", length = 50)
    private String nivelEducacional;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento;

    @Column(name = "data_admissao")
    private LocalDate dataAdmissao;

    @Column(name = "data_batismo")
    private LocalDate dataBatismo;

    @Column(name = "observacao", columnDefinition = "TEXT")
    private String observacao;

    @Column(name = "criado_em", updatable = false)
    private LocalDateTime criadoEm;

    @Column(name = "atualizado_em")
    private LocalDateTime atualizadoEm;

    @Enumerated(EnumType.STRING)
    @Column(name = "genero", length = 10, nullable = false)
    private Genero genero;

    public enum Genero {
        MASCULINO, FEMININO, OUTRO
    }
}
