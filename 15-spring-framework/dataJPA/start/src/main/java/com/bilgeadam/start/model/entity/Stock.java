package com.bilgeadam.start.model.entity;

import com.bilgeadam.start.model.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
@Data
public class Stock extends BaseEntity {

    private String name;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "bought_price")
    private Double boughtPrice;

    @Column(name = "sell_price")
    private Double sellPrice;

    @Column(name = "stock_code")
    private Long stockCode;

    @Column(name = "barcode")
    private Long barcode;

    @Column(name = "unit_id")
    private Long unitId;

    @Column(name = "isAlive")
    private Boolean isAlive;
}
