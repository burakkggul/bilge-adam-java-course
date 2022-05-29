package com.bilgeadam.stoktakip.repository;

import com.bilgeadam.stoktakip.model.entity.Stock;
import com.bilgeadam.stoktakip.repository.base.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockRepository extends CrudRepository<Stock,Long> {
}
