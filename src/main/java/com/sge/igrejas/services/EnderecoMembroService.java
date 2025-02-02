package com.sge.igrejas.services;

import com.sge.igrejas.entities.EnderecoMembro;
import com.sge.igrejas.repository.EnderecoMembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoMembroService {

    @Autowired
    private EnderecoMembroRepository enderecoMembroRepository;

    public List<EnderecoMembro> findAll() {
        return enderecoMembroRepository.findAll();
    }

    public EnderecoMembro findById(Integer id) {
        return enderecoMembroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Endereço do membro não encontrado!"));
    }

    public EnderecoMembro save(EnderecoMembro enderecoMembro) {
        return enderecoMembroRepository.save(enderecoMembro);
    }

    public EnderecoMembro update(Integer id, EnderecoMembro enderecoAtualizado) {
        EnderecoMembro endereco = findById(id);
        endereco.setRua(enderecoAtualizado.getRua());
        endereco.setNumero(enderecoAtualizado.getNumero());
        return enderecoMembroRepository.save(endereco);
    }

    public void delete(Integer id) {
        EnderecoMembro endereco = findById(id);
        enderecoMembroRepository.delete(endereco);
    }
}
