package com.sge.igrejas.mapper;

import com.sge.igrejas.dto.UsuarioDTO;
import com.sge.igrejas.entities.Usuario;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    UsuarioDTO toDTO(Usuario usuario);

    Usuario toEntity(UsuarioDTO usuarioDTO);
}
