package com.sge.igrejas.controllers;

import com.sge.igrejas.dto.UsuarioDTO;
import com.sge.igrejas.services.UsuarioService;
import com.sge.igrejas.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping("/login")
    public String showLoginPage(Model model) {
        model.addAttribute("usuario", new UsuarioDTO());
        return "login";
    }

    @PostMapping("/login")
    public String processLogin(@ModelAttribute UsuarioDTO usuarioDTO, Model model) {
        try {
            UsuarioDTO usuario = usuarioService.findByNome(usuarioDTO.getNome());

            if (!passwordEncoder.matches(usuarioDTO.getPassword(), usuario.getPassword())) {
                model.addAttribute("error", "Senha incorreta. Tente novamente.");
                return "login"; // Retorna para a tela de login sem redirecionamento
            }

            String token = JwtUtil.generateToken(usuario.getNome());
            model.addAttribute("token", token);
            return "login-success";

        } catch (RuntimeException e) {
            model.addAttribute("error", "Usuário não encontrado.");
            return "login"; // Retorna para a tela de login sem redirecionamento
        }
    }

}
