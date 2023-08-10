package com.sgb.prices.web.dtos;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record PriceDTO(
        Long productId,
        Long brandId,
        Long priceListId,
        BigDecimal price,
        LocalDateTime date
) { }
