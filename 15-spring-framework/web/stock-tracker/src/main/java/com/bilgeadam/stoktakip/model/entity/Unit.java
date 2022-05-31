package com.bilgeadam.stoktakip.model.entity;

import com.bilgeadam.stoktakip.model.dto.UnitRequest;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Unit {
    private Long id;
    private String name;

    public Unit(UnitRequest unitRequest){
        this.id = unitRequest.getId();
        this.name = unitRequest.getName();
    }

    public Unit(ResultSet resultSet) throws SQLException {
        this.id = resultSet.getLong("id");
        this.name = resultSet.getString("name");
    }

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
}
