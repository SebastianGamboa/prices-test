package com.sgb.prices.domain.services;

import com.sgb.prices.web.dtos.PriceDTO;

import java.time.LocalDateTime;

public interface PriceService {

    PriceDTO findBy(LocalDateTime date, Long productId, Long brandId);
}
