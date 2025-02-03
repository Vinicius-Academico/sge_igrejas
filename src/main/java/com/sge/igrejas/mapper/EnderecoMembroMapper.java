package com.sge.igrejas.mapper;

import com.sge.igrejas.dto.EnderecoMembroDTO;
import com.sge.igrejas.entities.EnderecoMembro;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface EnderecoMembroMapper {

    @Mapping(source = "membro.id", target = "membroId")
    EnderecoMembroDTO toDTO(EnderecoMembro enderecoMembro);

    @Mapping(source = "membroId", target = "membro.id")
    EnderecoMembro toEntity(EnderecoMembroDTO enderecoMembroDTO);
}
