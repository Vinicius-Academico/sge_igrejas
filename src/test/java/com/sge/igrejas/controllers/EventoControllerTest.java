package com.sge.igrejas.controllers;

import com.sge.igrejas.dto.EventoDTO;
import com.sge.igrejas.services.EventoService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(EventoController.class)
class EventoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private EventoService eventoService;

    @Test
    void getEventos() throws Exception {
        EventoDTO eventoMock = new EventoDTO(1, "Evento Teste", null, null, null, null, null, false);
        when(eventoService.findAll()).thenReturn(List.of(eventoMock));

        mockMvc.perform(get("/eventos"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].id").value(1))
                .andExpect(jsonPath("$[0].nomeEvento").value("Evento Teste"));
    }

    @Test
    void getEventos_Vazio() throws Exception {
        when(eventoService.findAll()).thenReturn(Collections.emptyList());

        mockMvc.perform(get("/eventos"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json("[]"));
    }
}
