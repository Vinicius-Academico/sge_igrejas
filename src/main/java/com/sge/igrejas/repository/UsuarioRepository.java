package com.sge.igrejas.repository;

import com.sge.igrejas.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    // Métodos customizados podem ser adicionados aqui, se necessário.
}

