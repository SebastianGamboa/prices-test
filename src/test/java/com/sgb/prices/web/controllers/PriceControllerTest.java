package com.sgb.prices.web.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sgb.prices.web.dtos.PriceDTO;
import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@SpringBootTest
@AutoConfigureMockMvc
public class PriceControllerTest {

    private static final String PRICE_PATH = "/api/price";
    private static final String PRODUCT_ID_PARAM = "productId";
    private static final String BRAND_ID_PARAM = "brandId";
    private static final String DATE_PARAM = "date";
    private static final Long ZARA_BRAND_ID = 1L;
    private static final Long PRODUCT_ID = 35455L;

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @BeforeEach
    public void setUp() {
        var flyway = Flyway.configure()
                .dataSource("jdbc:h2:mem:prices-db", "sgb", "sgb9182")
                .locations("db/migration")
                .load();
        flyway.migrate();
    }

    @Test
    public void shouldGetPriceRateForSpecificDate() throws Exception {
        var priceListId = 1L;
        var expectedPrice = new BigDecimal("35.50");
        var date = LocalDateTime.of(2020, 6, 14, 10, 0);

        var expectedResponse = new PriceDTO(
            PRODUCT_ID,
            ZARA_BRAND_ID,
            priceListId,
            expectedPrice,
            date
        );

        var mvcResult = mockMvc.perform(get(PRICE_PATH)
                        .param(PRODUCT_ID_PARAM, PRODUCT_ID.toString())
                        .param(BRAND_ID_PARAM, ZARA_BRAND_ID.toString())
                        .param(DATE_PARAM, date.toString())
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String responseBody = mvcResult.getResponse().getContentAsString();
        PriceDTO priceResponse = objectMapper.readValue(responseBody, PriceDTO.class);

        assertEquals(expectedResponse, priceResponse);
    }

    @Test
    public void shouldGetPriceRateForSpecificDate2() throws Exception {
        var priceListId = 2L;
        var expectedPrice = new BigDecimal("25.45");
        var date = LocalDateTime.of(2020, 6, 14, 16, 0);

        var expectedResponse = new PriceDTO(
                PRODUCT_ID,
                ZARA_BRAND_ID,
                priceListId,
                expectedPrice,
                date
        );

        var mvcResult = mockMvc.perform(get(PRICE_PATH)
                        .param(PRODUCT_ID_PARAM, PRODUCT_ID.toString())
                        .param(BRAND_ID_PARAM, ZARA_BRAND_ID.toString())
                        .param(DATE_PARAM, date.toString())
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String responseBody = mvcResult.getResponse().getContentAsString();
        PriceDTO priceResponse = objectMapper.readValue(responseBody, PriceDTO.class);

        assertEquals(expectedResponse, priceResponse);
    }

    @Test
    public void shouldGetPriceRateForSpecificDate3() throws Exception {
        var priceListId = 1L;
        var expectedPrice = new BigDecimal("35.50");
        var date = LocalDateTime.of(2020, 6, 14, 21, 0);

        var expectedResponse = new PriceDTO(
                PRODUCT_ID,
                ZARA_BRAND_ID,
                priceListId,
                expectedPrice,
                date
        );

        var mvcResult = mockMvc.perform(get(PRICE_PATH)
                        .param(PRODUCT_ID_PARAM, PRODUCT_ID.toString())
                        .param(BRAND_ID_PARAM, ZARA_BRAND_ID.toString())
                        .param(DATE_PARAM, date.toString())
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String responseBody = mvcResult.getResponse().getContentAsString();
        PriceDTO priceResponse = objectMapper.readValue(responseBody, PriceDTO.class);

        assertEquals(expectedResponse, priceResponse);
    }

    @Test
    public void shouldGetPriceRateForSpecificDate4() throws Exception {
        var priceListId = 3L;
        var expectedPrice = new BigDecimal("30.50");
        var date = LocalDateTime.of(2020, 6, 15, 10, 0);

        var expectedResponse = new PriceDTO(
                PRODUCT_ID,
                ZARA_BRAND_ID,
                priceListId,
                expectedPrice,
                date
        );

        var mvcResult = mockMvc.perform(get(PRICE_PATH)
                        .param(PRODUCT_ID_PARAM, PRODUCT_ID.toString())
                        .param(BRAND_ID_PARAM, ZARA_BRAND_ID.toString())
                        .param(DATE_PARAM, date.toString())
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String responseBody = mvcResult.getResponse().getContentAsString();
        PriceDTO priceResponse = objectMapper.readValue(responseBody, PriceDTO.class);

        assertEquals(expectedResponse, priceResponse);
    }

    @Test
    public void shouldGetPriceRateForSpecificDate5() throws Exception {
        var priceListId = 4L;
        var expectedPrice = new BigDecimal("38.95");
        var date = LocalDateTime.of(2020, 6, 16, 21, 0);

        var expectedResponse = new PriceDTO(
                PRODUCT_ID,
                ZARA_BRAND_ID,
                priceListId,
                expectedPrice,
                date
        );

        var mvcResult = mockMvc.perform(get(PRICE_PATH)
                        .param(PRODUCT_ID_PARAM, PRODUCT_ID.toString())
                        .param(BRAND_ID_PARAM, ZARA_BRAND_ID.toString())
                        .param(DATE_PARAM, date.toString())
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andReturn();

        String responseBody = mvcResult.getResponse().getContentAsString();
        PriceDTO priceResponse = objectMapper.readValue(responseBody, PriceDTO.class);

        assertEquals(expectedResponse, priceResponse);
    }
}
