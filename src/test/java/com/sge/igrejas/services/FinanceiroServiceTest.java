package com.sge.igrejas.services;

import com.sge.igrejas.dto.FinanceiroDTO;
import com.sge.igrejas.entities.Financeiro;
import com.sge.igrejas.mapper.FinanceiroMapper;
import com.sge.igrejas.repository.FinanceiroRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class FinanceiroServiceTest {

    @Mock
    private FinanceiroRepository financeiroRepository;

    @Mock
    private FinanceiroMapper financeiroMapper;

    @InjectMocks
    private FinanceiroService financeiroService;

    public FinanceiroServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void saveFinanceiro() {
        Financeiro financeiro = new Financeiro();
        financeiro.setDescricao("Compra");
        financeiro.setValor(BigDecimal.valueOf(1000));

        FinanceiroDTO financeiroDTO = new FinanceiroDTO(1, 1, "Compra", "Compra", BigDecimal.valueOf(1000), null, null);

        when(financeiroMapper.toEntity(financeiroDTO)).thenReturn(financeiro);
        when(financeiroRepository.save(any(Financeiro.class))).thenReturn(financeiro);
        when(financeiroMapper.toDTO(financeiro)).thenReturn(financeiroDTO);

        FinanceiroDTO salvo = financeiroService.save(financeiroDTO);
        assertNotNull(salvo);
        assertEquals("Compra", salvo.getDescricao());
        assertEquals(BigDecimal.valueOf(1000), salvo.getValor());
    }
}
