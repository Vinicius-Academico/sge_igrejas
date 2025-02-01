package com.sge.igrejas.repository;

import com.sge.igrejas.entities.EnderecoMembro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoMembroRepository extends JpaRepository<EnderecoMembro, Integer> {
    EnderecoMembro findByMembroId(Integer membroId);
}
