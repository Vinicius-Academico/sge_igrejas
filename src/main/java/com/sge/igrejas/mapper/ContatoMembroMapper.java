package com.sge.igrejas.mapper;

import com.sge.igrejas.dto.ContatoMembroDTO;
import com.sge.igrejas.entities.ContatoMembro;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ContatoMembroMapper {

    @Mapping(source = "membro.id", target = "membroId")
    ContatoMembroDTO toDTO(ContatoMembro contatoMembro);

    @Mapping(source = "membroId", target = "membro.id")
    ContatoMembro toEntity(ContatoMembroDTO contatoMembroDTO);
}
