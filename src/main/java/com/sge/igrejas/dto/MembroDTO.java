package com.sge.igrejas.dto;

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
public class MembroDTO {

    private Integer id;
    private Boolean isAtivo;
    private String nome;
    private String cpf;
    private String estadoCivil;
    private String profissao;
    private LocalDate dataNascimento;
    private LocalDate dataAdmissao;
    private LocalDate dataBatismo;
    private String genero;
}
