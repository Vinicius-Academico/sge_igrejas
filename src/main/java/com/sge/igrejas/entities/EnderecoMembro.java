package com.sge.igrejas.entities;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "endereco_membro")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EnderecoMembro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "membro_id", nullable = false)
    private Membro membro;

    @Column(name = "rua", length = 100, nullable = false)
    private String rua;

    @Column(name = "numero", length = 10)
    private String numero;

    @Column(name = "bairro", length = 50, nullable = false)
    private String bairro;

    @Column(name = "cidade", length = 50, nullable = false)
    private String cidade;

    @Column(name = "estado", length = 2, nullable = false)
    private String estado;

    @Column(name = "referencia", length = 150)
    private String referencia;

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
