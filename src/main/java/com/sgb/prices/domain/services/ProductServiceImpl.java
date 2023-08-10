package com.sgb.prices.domain.services;

import com.sgb.prices.data.ProductRepository;
import com.sgb.prices.domain.entities.Product;
import com.sgb.prices.web.dtos.ProductDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductDTO> findAll() {
        return productRepository.findAll().stream()
                .map(product -> new ProductDTO(
                        product.getId(),
                        product.getName()
                ))
                .collect(Collectors.toList());
    }

    @Override
    public void save(ProductDTO productDTO) {
        var product = new Product(
                productDTO.id(),
                productDTO.name()
        );
        productRepository.save(product);
    }
}
