package com.sge.igrejas.dto;

import java.time.LocalDateTime;
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
public class EnderecoMembroDTO {

    private Integer id;
    private Integer membroId; 
    private String rua;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String referencia;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;
}
