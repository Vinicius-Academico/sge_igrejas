package com.sge.igrejas.repository;

import com.sge.igrejas.entities.Membro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MembroRepository extends JpaRepository<Membro, Integer> {
}
