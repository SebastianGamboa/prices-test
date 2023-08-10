package com.sgb.prices.domain.services;

import com.sgb.prices.data.PriceRepository;
import com.sgb.prices.web.dtos.PriceDTO;
import com.sgb.prices.web.exceptions.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PriceServiceImpl implements PriceService {

    private final PriceRepository priceRepository;

    public PriceServiceImpl(PriceRepository priceRepository) {
        this.priceRepository = priceRepository;
    }
    @Override
    public PriceDTO findBy(LocalDateTime date, Long productId, Long brandId) {
        return priceRepository.findBy(date, productId, brandId)
                .orElseThrow(() -> new ResourceNotFoundException("Price not found"));
    }
}
