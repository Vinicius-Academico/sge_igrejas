package com.sge.igrejas.controllers;

import com.sge.igrejas.dto.EventoDTO;
import com.sge.igrejas.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @GetMapping
    public ResponseEntity<List<EventoDTO>> getEventos() {
        List<EventoDTO> eventos = eventoService.findAll();
        return ResponseEntity.ok(eventos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EventoDTO> getEventoById(@PathVariable Integer id) {
        EventoDTO evento = eventoService.findById(id);
        return ResponseEntity.ok(evento);
    }

    @PostMapping
    public ResponseEntity<EventoDTO> createEvento(@RequestBody EventoDTO eventoDTO) {
        EventoDTO novoEvento = eventoService.save(eventoDTO);
        return ResponseEntity.ok(novoEvento);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EventoDTO> updateEvento(@PathVariable Integer id, @RequestBody EventoDTO eventoAtualizado) {
        EventoDTO eventoAtualizadoDTO = eventoService.update(id, eventoAtualizado);
        return ResponseEntity.ok(eventoAtualizadoDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEvento(@PathVariable Integer id) {
        eventoService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
