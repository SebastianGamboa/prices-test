package com.sgb.prices.data;

import com.sgb.prices.domain.entities.Price;
import com.sgb.prices.web.dtos.PriceDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface PriceRepository extends CrudRepository<Price, Long> {

    @Query("""
            SELECT NEW com.sgb.prices.web.dtos.PriceDTO(
                p.product.id, p.brand.id, p.priceList.id, p.price, :date)
            FROM Price p
            WHERE p.product.id = :productId
            AND p.brand.id = :brandId
            AND :date BETWEEN p.startDate AND p.endDate
            GROUP BY p.product, p.priceList
            ORDER BY p.priority DESC
            LIMIT 1""")
    Optional<PriceDTO> findBy(LocalDateTime date, Long productId, Long brandId);
}
