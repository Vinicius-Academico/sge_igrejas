package com.sge.igrejas.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class FinanceiroDTO {

    private Integer idFinanceiro;
    private Integer eventoId; 
    private String descricao;
    private String tipoTransacao;
    private BigDecimal valor;
    private LocalDate dataTransacao;
    private String fornecedor;
}
