package com.sge.igrejas.controllers;

import com.sge.igrejas.dto.FinanceiroDTO;
import com.sge.igrejas.services.FinanceiroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/financeiros")
public class FinanceiroController {

    @Autowired
    private FinanceiroService financeiroService;

    @GetMapping
    public ResponseEntity<List<FinanceiroDTO>> getFinanceiros() {
        List<FinanceiroDTO> financeiros = financeiroService.findAll();
        return ResponseEntity.ok(financeiros);
    }

    @GetMapping("/{id}")
    public ResponseEntity<FinanceiroDTO> getFinanceiroById(@PathVariable Integer id) {
        FinanceiroDTO financeiro = financeiroService.findById(id);
        return ResponseEntity.ok(financeiro);
    }

    @PostMapping
    public ResponseEntity<FinanceiroDTO> createFinanceiro(@RequestBody FinanceiroDTO financeiroDTO) {
        FinanceiroDTO novoFinanceiro = financeiroService.save(financeiroDTO);
        return ResponseEntity.ok(novoFinanceiro);
    }

    @PutMapping("/{id}")
    public ResponseEntity<FinanceiroDTO> updateFinanceiro(@PathVariable Integer id, @RequestBody FinanceiroDTO financeiroAtualizado) {
        FinanceiroDTO financeiroAtualizadoDTO = financeiroService.update(id, financeiroAtualizado);
        return ResponseEntity.ok(financeiroAtualizadoDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFinanceiro(@PathVariable Integer id) {
        financeiroService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
