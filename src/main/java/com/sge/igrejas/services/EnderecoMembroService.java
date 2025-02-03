package com.sge.igrejas.services;

import com.sge.igrejas.dto.EnderecoMembroDTO;
import com.sge.igrejas.entities.EnderecoMembro;
import com.sge.igrejas.mapper.EnderecoMembroMapper;
import com.sge.igrejas.repository.EnderecoMembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EnderecoMembroService {

    @Autowired
    private EnderecoMembroRepository enderecoMembroRepository;

    @Autowired
    private EnderecoMembroMapper enderecoMembroMapper;

    public List<EnderecoMembroDTO> findAll() {
        List<EnderecoMembro> enderecos = enderecoMembroRepository.findAll();
        return enderecos.stream()
                .map(enderecoMembroMapper::toDTO)
                .collect(Collectors.toList());
    }

    public EnderecoMembroDTO findById(Integer id) {
        EnderecoMembro endereco = enderecoMembroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Endereço do membro não encontrado!"));
        return enderecoMembroMapper.toDTO(endereco);
    }

    public EnderecoMembroDTO save(EnderecoMembroDTO enderecoMembroDTO) {
        EnderecoMembro endereco = enderecoMembroMapper.toEntity(enderecoMembroDTO);
        EnderecoMembro savedEndereco = enderecoMembroRepository.save(endereco);
        return enderecoMembroMapper.toDTO(savedEndereco);
    }

    public EnderecoMembroDTO update(Integer id, EnderecoMembroDTO enderecoAtualizadoDTO) {
        EnderecoMembro enderecoExistente = enderecoMembroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Endereço do membro não encontrado!"));

        enderecoExistente.setRua(enderecoAtualizadoDTO.getRua());
        enderecoExistente.setNumero(enderecoAtualizadoDTO.getNumero());
        enderecoExistente.setBairro(enderecoAtualizadoDTO.getBairro());
        enderecoExistente.setCidade(enderecoAtualizadoDTO.getCidade());
        enderecoExistente.setEstado(enderecoAtualizadoDTO.getEstado());
        enderecoExistente.setReferencia(enderecoAtualizadoDTO.getReferencia());

        EnderecoMembro updatedEndereco = enderecoMembroRepository.save(enderecoExistente);
        return enderecoMembroMapper.toDTO(updatedEndereco);
    }

    public void delete(Integer id) {
        EnderecoMembro endereco = enderecoMembroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Endereço do membro não encontrado!"));
        enderecoMembroRepository.delete(endereco);
    }
}
