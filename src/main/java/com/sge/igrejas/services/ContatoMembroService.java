package com.sge.igrejas.services;

import com.sge.igrejas.dto.ContatoMembroDTO;
import com.sge.igrejas.entities.ContatoMembro;
import com.sge.igrejas.mapper.ContatoMembroMapper;
import com.sge.igrejas.repository.ContatoMembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContatoMembroService {

    @Autowired
    private ContatoMembroRepository contatoMembroRepository;

    @Autowired
    private ContatoMembroMapper contatoMembroMapper;

    public List<ContatoMembroDTO> findAll() {
        List<ContatoMembro> contatos = contatoMembroRepository.findAll();
        return contatos.stream()
                .map(contatoMembroMapper::toDTO)
                .collect(Collectors.toList());
    }

    public ContatoMembroDTO findById(Integer id) {
        ContatoMembro contato = contatoMembroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contato do membro não encontrado!"));
        return contatoMembroMapper.toDTO(contato);
    }

    public ContatoMembroDTO save(ContatoMembroDTO contatoMembroDTO) {
        ContatoMembro contato = contatoMembroMapper.toEntity(contatoMembroDTO);
        ContatoMembro savedContato = contatoMembroRepository.save(contato);
        return contatoMembroMapper.toDTO(savedContato);
    }

    public ContatoMembroDTO update(Integer id, ContatoMembroDTO contatoAtualizadoDTO) {
        ContatoMembro contatoExistente = contatoMembroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contato do membro não encontrado!"));

        contatoExistente.setTelefoneContato(contatoAtualizadoDTO.getTelefoneContato());
        contatoExistente.setTelefoneWhatsapp(contatoAtualizadoDTO.getTelefoneWhatsapp());
        contatoExistente.setEmail(contatoAtualizadoDTO.getEmail());
        contatoExistente.setOutroContato(contatoAtualizadoDTO.getOutroContato());

        ContatoMembro updatedContato = contatoMembroRepository.save(contatoExistente);
        return contatoMembroMapper.toDTO(updatedContato);
    }

    public void delete(Integer id) {
        ContatoMembro contato = contatoMembroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contato do membro não encontrado!"));
        contatoMembroRepository.delete(contato);
    }
}
