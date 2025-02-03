package com.sge.igrejas.services;

import com.sge.igrejas.dto.MembroDTO;
import com.sge.igrejas.entities.Membro;
import com.sge.igrejas.mapper.MembroMapper;
import com.sge.igrejas.repository.MembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MembroService {

    @Autowired
    private MembroRepository membroRepository;

    @Autowired
    private MembroMapper membroMapper;

    public List<MembroDTO> findAll() {
        List<Membro> membros = membroRepository.findAll();
        return membros.stream()
                .map(membroMapper::toDTO)
                .collect(Collectors.toList());
    }

    public MembroDTO findById(Integer id) {
        Membro membro = membroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Membro não encontrado!"));
        return membroMapper.toDTO(membro);
    }

    public MembroDTO save(MembroDTO membroDTO) {
        Membro membro = membroMapper.toEntity(membroDTO);
        Membro savedMembro = membroRepository.save(membro);
        return membroMapper.toDTO(savedMembro);
    }

    public MembroDTO update(Integer id, MembroDTO membroAtualizadoDTO) {
        Membro membroExistente = membroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Membro não encontrado!"));

        membroExistente.setNome(membroAtualizadoDTO.getNome());
        membroExistente.setCpf(membroAtualizadoDTO.getCpf());
        membroExistente.setDataNascimento(membroAtualizadoDTO.getDataNascimento());
        membroExistente.setGenero(Membro.Genero.valueOf(membroAtualizadoDTO.getGenero()));
        membroExistente.setEstadoCivil(membroAtualizadoDTO.getEstadoCivil());
        membroExistente.setProfissao(membroAtualizadoDTO.getProfissao());

        Membro updatedMembro = membroRepository.save(membroExistente);
        return membroMapper.toDTO(updatedMembro);
    }

    public void delete(Integer id) {
        Membro membro = membroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Membro não encontrado!"));
        membroRepository.delete(membro);
    }
}
