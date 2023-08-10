package com.sgb.prices.web.controllers;

import com.sgb.prices.domain.services.PriceService;
import com.sgb.prices.web.dtos.PriceDTO;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("api/price")
public class PriceController {

    private final PriceService priceService;

    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping
    public PriceDTO getPriceBy(
        @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") LocalDateTime date,
        @RequestParam Long productId,
        @RequestParam Long brandId
    ) {
        var a = priceService.findBy(date, productId, brandId);
        return a;
    }
}
