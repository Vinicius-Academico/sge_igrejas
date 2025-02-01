
package com.sge.igrejas.repository;

import com.sge.igrejas.entities.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer> {
    List<Evento> findByDataEventoBetween(LocalDate inicio, LocalDate fim);
    List<Evento> findByResponsavelId(Integer responsavelId);
}
