package com.bilgeadam.stoktakip.repository;

import com.bilgeadam.stoktakip.model.entity.Stock;
import com.bilgeadam.stoktakip.repository.base.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Connection;

public interface StockRepository extends CrudRepository<Stock,Long> {
}
