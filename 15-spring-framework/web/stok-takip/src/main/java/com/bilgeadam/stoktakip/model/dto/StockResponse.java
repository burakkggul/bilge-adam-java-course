package com.bilgeadam.stoktakip.model.dto;

import com.bilgeadam.stoktakip.model.entity.Stock;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StockResponse {
    private Long id;
    private String name;
    private Integer quantity;
    private Double boughtPrice;
    private Double sellPrice;
    private Long stockCode;
    private Long barcode;
    private Long unitId;

    public StockResponse(Stock stock){
        this.id = stock.getId();
        this.name = stock.getName();
        this.quantity = stock.getQuantity();
        this.boughtPrice = stock.getBoughtPrice();
        this.sellPrice = stock.getSellPrice();
        this.stockCode = stock.getStockCode();
        this.barcode = stock.getBarcode();
        this.unitId = stock.getUnitId();
    }
}
