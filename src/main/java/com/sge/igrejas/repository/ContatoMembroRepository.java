package com.sge.igrejas.repository;


import com.sge.igrejas.entities.ContatoMembro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoMembroRepository extends JpaRepository<ContatoMembro, Integer> {
    ContatoMembro findByMembroId(Integer membroId);
}
