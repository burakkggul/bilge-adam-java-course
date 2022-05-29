package com.bilgeadam.stoktakip.repository;

import com.bilgeadam.stoktakip.model.entity.Unit;
import com.bilgeadam.stoktakip.repository.base.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnitRepository extends CrudRepository<Unit,Long> {
}
