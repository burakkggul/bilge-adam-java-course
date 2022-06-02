package com.bilgeadam.stoktakip.repository;

import com.bilgeadam.stoktakip.model.entity.Stock;
import com.bilgeadam.stoktakip.model.entity.Unit;
import com.bilgeadam.stoktakip.repository.base.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.util.List;

public interface StockRepository extends CrudRepository<Stock,Long> {
    List<Stock> findAllSellAndBoughtPriceAndQuantity();
    Double findProfitFromAllStocks();

    Boolean isStockExists(Long barcode, Long stockCode);
}
