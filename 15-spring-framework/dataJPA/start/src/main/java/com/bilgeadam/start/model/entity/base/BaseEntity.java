package com.bilgeadam.start.model.entity.base;

import lombok.Data;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public class BaseEntity {
    //@JsonIgnore
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
