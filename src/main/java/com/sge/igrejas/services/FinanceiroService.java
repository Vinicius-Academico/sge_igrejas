package com.sge.igrejas.services;

import com.sge.igrejas.dto.FinanceiroDTO;
import com.sge.igrejas.entities.Financeiro;
import com.sge.igrejas.mapper.FinanceiroMapper;
import com.sge.igrejas.repository.FinanceiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FinanceiroService {

    @Autowired
    private FinanceiroRepository financeiroRepository;

    @Autowired
    private FinanceiroMapper financeiroMapper;

    public List<FinanceiroDTO> findAll() {
        List<Financeiro> registros = financeiroRepository.findAll();
        return registros.stream()
                .map(financeiroMapper::toDTO)
                .collect(Collectors.toList());
    }

    public FinanceiroDTO findById(Integer id) {
        Financeiro registro = financeiroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Registro financeiro não encontrado!"));
        return financeiroMapper.toDTO(registro);
    }

    public FinanceiroDTO save(FinanceiroDTO financeiroDTO) {
        Financeiro registro = financeiroMapper.toEntity(financeiroDTO);
        Financeiro savedRegistro = financeiroRepository.save(registro);
        return financeiroMapper.toDTO(savedRegistro);
    }

    public FinanceiroDTO update(Integer id, FinanceiroDTO financeiroAtualizadoDTO) {
        Financeiro registroExistente = financeiroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Registro financeiro não encontrado!"));

        registroExistente.setDescricao(financeiroAtualizadoDTO.getDescricao());
        registroExistente.setValor(financeiroAtualizadoDTO.getValor());
        registroExistente.setTipoTransacao(Financeiro.TipoTransacao.valueOf(financeiroAtualizadoDTO.getTipoTransacao()));
        registroExistente.setDataTransacao(financeiroAtualizadoDTO.getDataTransacao());
        registroExistente.setFornecedor(financeiroAtualizadoDTO.getFornecedor());

        Financeiro updatedRegistro = financeiroRepository.save(registroExistente);
        return financeiroMapper.toDTO(updatedRegistro);
    }

    public void delete(Integer id) {
        Financeiro registro = financeiroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Registro financeiro não encontrado!"));
        financeiroRepository.delete(registro);
    }
}
