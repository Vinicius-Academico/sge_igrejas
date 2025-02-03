package com.sge.igrejas.dto;

import java.time.LocalDate;
import java.time.LocalTime;
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
public class EventoDTO {

    private Integer id;
    private String nomeEvento;
    private String descricao;
    private String local;
    private LocalDate dataEvento;
    private LocalTime horario;
    private Integer responsavelId; 
    private Boolean concluido;
}
