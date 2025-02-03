package com.sge.igrejas.controllers;

import com.sge.igrejas.dto.FinanceiroDTO;
import com.sge.igrejas.services.FinanceiroService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(FinanceiroController.class)
class FinanceiroControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private FinanceiroService financeiroService;

    @Test
    void getFinanceiros() throws Exception {
        FinanceiroDTO financeiroMock = new FinanceiroDTO(1, 1, "Compra", "Compra", BigDecimal.valueOf(1000), null, null);
        when(financeiroService.findAll()).thenReturn(List.of(financeiroMock));

        mockMvc.perform(get("/financeiros"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$[0].idFinanceiro").value(1))
                .andExpect(jsonPath("$[0].descricao").value("Compra"))
                .andExpect(jsonPath("$[0].valor").value(1000));
    }

    @Test
    void getFinanceiros_Vazio() throws Exception {
        when(financeiroService.findAll()).thenReturn(Collections.emptyList());

        mockMvc.perform(get("/financeiros"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(content().json("[]"));
    }
}
