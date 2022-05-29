package com.bilgeadam.stoktakip.repository.base;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<E,T> {
    void save(E e);
    List<E> findAll();
    Optional<E> findById(T id);
    void update(E e);
    void delete(T id);
}
