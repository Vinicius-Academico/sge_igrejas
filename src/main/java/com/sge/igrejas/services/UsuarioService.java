package com.sge.igrejas.services;

import com.sge.igrejas.dto.UsuarioDTO;
import com.sge.igrejas.entities.Usuario;
import com.sge.igrejas.mapper.UsuarioMapper;
import com.sge.igrejas.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioMapper usuarioMapper;

    public List<UsuarioDTO> findAll() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios.stream()
                .map(usuarioMapper::toDTO)
                .collect(Collectors.toList());
    }

    public UsuarioDTO findById(Long id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
        return usuarioMapper.toDTO(usuario);
    }

    public UsuarioDTO save(UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioMapper.toEntity(usuarioDTO);
        Usuario savedUsuario = usuarioRepository.save(usuario);
        return usuarioMapper.toDTO(savedUsuario);
    }

    public UsuarioDTO update(Long id, UsuarioDTO usuarioAtualizadoDTO) {
        Usuario usuarioExistente = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));

        usuarioExistente.setNome(usuarioAtualizadoDTO.getNome());
        usuarioExistente.setPassword(usuarioAtualizadoDTO.getNome());

        Usuario updatedUsuario = usuarioRepository.save(usuarioExistente);
        return usuarioMapper.toDTO(updatedUsuario);
    }

    public void delete(Long id) {
        Usuario usuario = usuarioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
        usuarioRepository.delete(usuario);
    }
}
