package com.sge.igrejas.mapper;

import com.sge.igrejas.dto.MembroDTO;
import com.sge.igrejas.entities.Membro;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MembroMapper {

    MembroDTO toDTO(Membro membro);

    Membro toEntity(MembroDTO membroDTO);
}
