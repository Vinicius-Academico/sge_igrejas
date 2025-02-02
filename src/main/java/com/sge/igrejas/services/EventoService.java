package com.sge.igrejas.services;

import com.sge.igrejas.entities.Evento;
import com.sge.igrejas.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public List<Evento> findAll() {
        return eventoRepository.findAll();
    }

    public Evento findById(Integer id) {
        return eventoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Evento não encontrado!"));
    }

    public Evento save(Evento evento) {
        return eventoRepository.save(evento);
    }

    public Evento update(Integer id, Evento eventoAtualizado) {
        Evento evento = findById(id);
        evento.setNomeEvento(eventoAtualizado.getNomeEvento());
        evento.setDescricao(eventoAtualizado.getDescricao());
        evento.setDataEvento(eventoAtualizado.getDataEvento());
        return eventoRepository.save(evento);
    }

    public void delete(Integer id) {
        Evento evento = findById(id);
        eventoRepository.delete(evento);
    }
}
