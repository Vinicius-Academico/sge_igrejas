package com.sge.igrejas.services;

import com.sge.igrejas.dto.EventoDTO;
import com.sge.igrejas.entities.Evento;
import com.sge.igrejas.mapper.EventoMapper;
import com.sge.igrejas.repository.EventoRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class EventoServiceTest {

    @Mock
    private EventoRepository eventoRepository;

    @Mock
    private EventoMapper eventoMapper;

    @InjectMocks
    private EventoService eventoService;

    public EventoServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void findById_EventoExistente() {
        Evento evento = new Evento();
        evento.setId(1);
        when(eventoRepository.findById(1)).thenReturn(Optional.of(evento));
        when(eventoMapper.toDTO(evento)).thenReturn(new EventoDTO(1, "Evento Teste", null, null, null, null, null, false));

        EventoDTO dto = eventoService.findById(1);
        assertNotNull(dto);
        assertEquals(1, dto.getId());
        assertEquals("Evento Teste", dto.getNomeEvento());
    }

    @Test
    void findById_EventoNaoExistente() {
        when(eventoRepository.findById(99)).thenReturn(Optional.empty());

        Exception exception = assertThrows(RuntimeException.class, () -> eventoService.findById(99));
        assertEquals("Evento não encontrado!", exception.getMessage());
    }
}
