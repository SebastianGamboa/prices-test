package com.sgb.prices.domain.services;

import com.sgb.prices.web.dtos.ProductDTO;

import java.util.List;

public interface ProductService {

    List<ProductDTO> findAll();

    void save(ProductDTO productDTO);
}
