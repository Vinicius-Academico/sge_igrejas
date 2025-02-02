package com.sge.igrejas.services;

import com.sge.igrejas.entities.ContatoMembro;
import com.sge.igrejas.repository.ContatoMembroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoMembroService {

    @Autowired
    private ContatoMembroRepository contatoMembroRepository;

    public List<ContatoMembro> findAll() {
        return contatoMembroRepository.findAll();
    }

    public ContatoMembro findById(Integer id) {
        return contatoMembroRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contato do membro não encontrado!"));
    }

    public ContatoMembro save(ContatoMembro contatoMembro) {
        return contatoMembroRepository.save(contatoMembro);
    }

    public ContatoMembro update(Integer id, ContatoMembro contatoAtualizado) {
        ContatoMembro contato = findById(id);
        contato.setTelefoneContato(contatoAtualizado.getTelefoneContato());
        contato.setTelefoneWhatsapp(contatoAtualizado.getTelefoneWhatsapp());
        contato.setEmail(contatoAtualizado.getEmail());
        contato.setOutroContato(contatoAtualizado.getOutroContato());
        return contatoMembroRepository.save(contato);
    }

    public void delete(Integer id) {
        ContatoMembro contato = findById(id);
        contatoMembroRepository.delete(contato);
    }
}
