package com.sge.igrejas.controllers;

import com.sge.igrejas.dto.UsuarioDTO;
import com.sge.igrejas.services.UsuarioService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.ui.Model;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.mockito.MockitoAnnotations;

class AuthControllerTest {

    @Mock
    private UsuarioService usuarioService;

    @Mock
    private Model model;

    @InjectMocks
    private AuthController authController;

    public AuthControllerTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void processLogin_UsuarioValido() {
        UsuarioDTO usuarioMock = new UsuarioDTO(1L, "admin", "123456");
        when(usuarioService.findByNome("admin")).thenReturn(usuarioMock);

        String viewName = authController.processLogin(new UsuarioDTO(null, "admin", "123456"), model);

        verify(model).addAttribute(eq("token"), anyString());
        assertEquals("login-success", viewName);
    }

    @Test
    void processLogin_UsuarioInvalido() {
        when(usuarioService.findByNome("admin")).thenThrow(new RuntimeException("Usuário não encontrado"));

        String viewName = authController.processLogin(new UsuarioDTO(null, "admin", "senha_errada"), model);

        verify(model).addAttribute(eq("error"), eq("Usuário não encontrado"));
        assertEquals("login", viewName);
    }
}
