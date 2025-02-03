package com.sge.igrejas.mapper;

import com.sge.igrejas.dto.FinanceiroDTO;
import com.sge.igrejas.entities.Financeiro;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface FinanceiroMapper {

    @Mapping(source = "evento.id", target = "eventoId")
    FinanceiroDTO toDTO(Financeiro financeiro);

    @Mapping(source = "eventoId", target = "evento.id")
    Financeiro toEntity(FinanceiroDTO financeiroDTO);
}
