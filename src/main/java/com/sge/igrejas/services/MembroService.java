package com.sge.igrejas.services;

import com.sge.igrejas.entities.Membro;
import com.sge.igrejas.repository.MembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembroService {

    @Autowired
    private MembroRepository membroRepository;

    public List<Membro> findAll() {
        return membroRepository.findAll();
    }

    public Membro findById(Integer id) {
        return membroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Membro não encontrado!"));
    }

    public Membro save(Membro membro) {
        return membroRepository.save(membro);
    }

    public Membro update(Integer id, Membro membroAtualizado) {
        Membro membro = findById(id);
        membro.setNome(membroAtualizado.getNome());
        membro.setCpf(membroAtualizado.getCpf());
        membro.setDataNascimento(membroAtualizado.getDataNascimento());
        membro.setGenero(membroAtualizado.getGenero());
        return membroRepository.save(membro);
    }

    public void delete(Integer id) {
        Membro membro = findById(id);
        membroRepository.delete(membro);
    }
}
