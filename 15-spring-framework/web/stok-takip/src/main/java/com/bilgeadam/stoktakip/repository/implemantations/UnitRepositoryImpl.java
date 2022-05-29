package com.bilgeadam.stoktakip.repository.implemantations;

import com.bilgeadam.stoktakip.model.entity.Unit;
import com.bilgeadam.stoktakip.repository.UnitRepository;
import com.bilgeadam.stoktakip.repository.base.CrudRepository;

import java.util.List;
import java.util.Optional;

public class UnitRepositoryImpl implements UnitRepository {
    @Override
    public void save(Unit unit) {

    }

    @Override
    public List<Unit> findAll() {
        return null;
    }

    @Override
    public Optional<Unit> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void update(Unit unit) {

    }

    @Override
    public void delete(Long id) {

    }
}
