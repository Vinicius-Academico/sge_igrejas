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
public class ContatoMembroDTO {

    private Integer id;
    private Integer membroId;
    private String telefoneContato;
    private String telefoneWhatsapp;
    private String email;
    private String outroContato;
    private LocalDateTime criadoEm;
    private LocalDateTime atualizadoEm;
}
