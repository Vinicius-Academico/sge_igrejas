package com.sge.igrejas.repository;

import com.sge.igrejas.entities.Financeiro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface FinanceiroRepository extends JpaRepository<Financeiro, Integer> {
    List<Financeiro> findByDataTransacaoBetween(LocalDate inicio, LocalDate fim);
    List<Financeiro> findByEventoId(Integer eventoId);
    List<Financeiro> findByTipoTransacao(Financeiro.TipoTransacao tipoTransacao);
}
