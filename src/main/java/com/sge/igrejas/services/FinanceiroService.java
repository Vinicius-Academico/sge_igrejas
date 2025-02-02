package com.sge.igrejas.services;

import com.sge.igrejas.entities.Financeiro;
import com.sge.igrejas.repository.FinanceiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinanceiroService {

    @Autowired
    private FinanceiroRepository financeiroRepository;

    public List<Financeiro> findAll() {
        return financeiroRepository.findAll();
    }

    public Financeiro findById(Integer id) {
        return financeiroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Registro financeiro não encontrado!"));
    }

    public Financeiro save(Financeiro financeiro) {
        return financeiroRepository.save(financeiro);
    }

    public Financeiro update(Integer id, Financeiro financeiroAtualizado) {
        Financeiro financeiro = findById(id);
        financeiro.setDescricao(financeiroAtualizado.getDescricao());
        financeiro.setValor(financeiroAtualizado.getValor());
        financeiro.setTipoTransacao(financeiroAtualizado.getTipoTransacao());
        return financeiroRepository.save(financeiro);
    }

    public void delete(Integer id) {
        Financeiro financeiro = findById(id);
        financeiroRepository.delete(financeiro);
    }
}
