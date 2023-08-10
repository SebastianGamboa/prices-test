package com.sgb.prices.data;

import com.sgb.prices.domain.entities.PriceList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PriceListRepository extends CrudRepository<PriceList, Long> {
}
