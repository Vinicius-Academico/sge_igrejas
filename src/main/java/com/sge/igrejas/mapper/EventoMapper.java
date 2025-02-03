package com.sge.igrejas.mapper;

import com.sge.igrejas.dto.EventoDTO;
import com.sge.igrejas.entities.Evento;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EventoMapper {

    @Mapping(source = "responsavel.id", target = "responsavelId")
    EventoDTO toDTO(Evento evento);

    @Mapping(source = "responsavelId", target = "responsavel.id")
    Evento toEntity(EventoDTO eventoDTO);
}
