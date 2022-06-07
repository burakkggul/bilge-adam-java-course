package com.bilgeadam.start.model.entity;

import com.bilgeadam.start.model.entity.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="unit")
@Getter
@Setter
public class Unit extends BaseEntity {
    private String name;
}
