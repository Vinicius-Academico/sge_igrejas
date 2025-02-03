package com.sge.igrejas.services;

import com.sge.igrejas.dto.EventoDTO;
import com.sge.igrejas.entities.Evento;
import com.sge.igrejas.mapper.EventoMapper;
import com.sge.igrejas.repository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private EventoMapper eventoMapper;

    public List<EventoDTO> findAll() {
        List<Evento> eventos = eventoRepository.findAll();
        return eventos.stream()
                .map(eventoMapper::toDTO)
                .collect(Collectors.toList());
    }

    public EventoDTO findById(Integer id) {
        Evento evento = eventoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Evento não encontrado!"));
        return eventoMapper.toDTO(evento);
    }

    public EventoDTO save(EventoDTO eventoDTO) {
        Evento evento = eventoMapper.toEntity(eventoDTO);
        Evento savedEvento = eventoRepository.save(evento);
        return eventoMapper.toDTO(savedEvento);
    }

    public EventoDTO update(Integer id, EventoDTO eventoAtualizadoDTO) {
        Evento eventoExistente = eventoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Evento não encontrado!"));

        eventoExistente.setNomeEvento(eventoAtualizadoDTO.getNomeEvento());
        eventoExistente.setDescricao(eventoAtualizadoDTO.getDescricao());
        eventoExistente.setDataEvento(eventoAtualizadoDTO.getDataEvento());
        eventoExistente.setHorario(eventoAtualizadoDTO.getHorario());
        eventoExistente.setLocal(eventoAtualizadoDTO.getLocal());
        eventoExistente.setConcluido(eventoAtualizadoDTO.getConcluido());

        Evento updatedEvento = eventoRepository.save(eventoExistente);
        return eventoMapper.toDTO(updatedEvento);
    }

    public void delete(Integer id) {
        Evento evento = eventoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Evento não encontrado!"));
        eventoRepository.delete(evento);
    }
}
