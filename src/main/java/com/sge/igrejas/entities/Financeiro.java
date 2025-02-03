package com.sge.igrejas.entities;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "financeiro")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Financeiro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFinanceiro;

    @ManyToOne
    @JoinColumn(name = "evento_id", nullable = false)
    private Evento evento;

    @Column(name = "descricao", length = 255, nullable = false)
    private String descricao;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_transacao", nullable = false)
    private TipoTransacao tipoTransacao;

    @Column(name = "valor", precision = 10, scale = 2, nullable = false)
    private BigDecimal valor;

    @Column(name = "data_transacao", nullable = false)
    private LocalDate dataTransacao;

    @Column(name = "fornecedor", length = 100)
    private String fornecedor;

    public enum TipoTransacao {
        Faturamento, Compra
    }
}
