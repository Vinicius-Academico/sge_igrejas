package com.sge.igrejas.services;

import com.sge.igrejas.dto.UsuarioDTO;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final PasswordEncoder passwordEncoder;
    private UsuarioDTO usuario;

    public UsuarioService(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
        this.usuario = new UsuarioDTO(1L, "admin", this.passwordEncoder.encode("123456"));
    }

    public UsuarioDTO findByNome(String nome) {
        if (usuario.getNome().equals(nome)) {
            return usuario;
        }
        throw new RuntimeException("Usuário não encontrado!");
    }

    public UsuarioDTO save(UsuarioDTO usuarioDTO) {
        String senhaCriptografada = passwordEncoder.encode(usuarioDTO.getPassword());
        usuario = new UsuarioDTO(usuarioDTO.getId(), usuarioDTO.getNome(), senhaCriptografada);
        return usuario;
    }

    public UsuarioDTO update(Long id, UsuarioDTO usuarioAtualizado) {
        if (usuario.getId().equals(id)) {
            usuario.setNome(usuarioAtualizado.getNome());
            usuario.setPassword(usuarioAtualizado.getPassword());
            return usuario;
        }
        throw new RuntimeException("Usuário não encontrado!");
    }

    public void delete(Long id) {
        if (usuario.getId().equals(id)) {
            usuario = null;
        } else {
            throw new RuntimeException("Usuário não encontrado!");
        }
    }
}
