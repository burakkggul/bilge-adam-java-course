package com.bilgeadam.start.model.entity;

import com.bilgeadam.start.model.entity.base.BaseEntity;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "stock")
@Data
@NamedQuery(name = "Stock.say", query ="SELECT count(s.id) FROM Stock s")
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

    @ManyToOne
    @JoinColumn(name="unit_id")
    private Unit unit;

    @Column(name = "isAlive")
    private Boolean isAlive;
}
