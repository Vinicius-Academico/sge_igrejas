package com.sge.igrejas.services;

import com.sge.igrejas.dto.UsuarioDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioServiceTest {
    private UsuarioService usuarioService;
    private PasswordEncoder passwordEncoder;

    @BeforeEach
    void setUp() {
        passwordEncoder = new BCryptPasswordEncoder();
        usuarioService = new UsuarioService(passwordEncoder);
    }

    @Test
    void findByNome_UsuarioExistente() {
        UsuarioDTO usuario = usuarioService.findByNome("admin");
        assertNotNull(usuario);
        assertEquals("admin", usuario.getNome());
    }

    @Test
    void findByNome_UsuarioNaoExistente() {
        Exception exception = assertThrows(RuntimeException.class, () -> usuarioService.findByNome("inexistente"));
        assertEquals("Usuário não encontrado!", exception.getMessage());
    }

    @Test
    void saveUsuario() {
        UsuarioDTO novoUsuario = new UsuarioDTO(2L, "novo", "senha123");
        UsuarioDTO salvo = usuarioService.save(novoUsuario);

        assertNotNull(salvo);
        assertEquals("novo", salvo.getNome());
        assertTrue(passwordEncoder.matches("senha123", salvo.getPassword()));
    }
}
