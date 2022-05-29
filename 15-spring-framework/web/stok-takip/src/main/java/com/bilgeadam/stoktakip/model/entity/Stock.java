package com.bilgeadam.stoktakip.model.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Stock {

    public Stock(Long id, String name, Integer quantity,
                 Double boughtPrice, Double sellPrice,
                 Long stockCode, Long barcode, Long unitId) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
        this.stockCode = stockCode;
        this.barcode = barcode;
        this.unitId = unitId;
    }

    public Stock(ResultSet resultSet) throws SQLException {
        this.id = resultSet.getLong("id");
        this.name = resultSet.getString("name");
        this.quantity = resultSet.getInt("quantity");
        this.boughtPrice = resultSet.getDouble("bought_price");
        this.sellPrice = resultSet.getDouble("sell_price");
        this.stockCode = resultSet.getLong("stock_code");
        this.barcode = resultSet.getLong("barcode");
        this.unitId = resultSet.getLong("unit_id");
    }

    private Long id;
    private String name;
    private Integer quantity;
    private Double boughtPrice;
    private Double sellPrice;
    private Long stockCode;
    private Long barcode;
    private Long unitId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getBoughtPrice() {
        return boughtPrice;
    }

    public void setBoughtPrice(Double boughtPrice) {
        this.boughtPrice = boughtPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public Long getStockCode() {
        return stockCode;
    }

    public void setStockCode(Long stockCode) {
        this.stockCode = stockCode;
    }

    public Long getBarcode() {
        return barcode;
    }

    public void setBarcode(Long barcode) {
        this.barcode = barcode;
    }

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }
}
