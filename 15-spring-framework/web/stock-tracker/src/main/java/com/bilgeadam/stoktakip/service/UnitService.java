package com.bilgeadam.stoktakip.service;

import com.bilgeadam.stoktakip.model.dto.UnitRequest;
import com.bilgeadam.stoktakip.model.dto.UnitResponse;
import com.bilgeadam.stoktakip.model.entity.Unit;
import com.bilgeadam.stoktakip.repository.UnitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class UnitService {

    private final UnitRepository unitRepository;

    /*
    Lombok kullanıldığı için yazılmayabilir. @RequiredArgsConstructor
    public UnitService(UnitRepository unitRepository){
        this.unitRepository = unitRepository;
    }*/

    public void save(UnitRequest unitRequest) {
        Unit unit = new Unit(unitRequest);
        this.unitRepository.save(unit);
    }

    public List<UnitResponse> findAll(){
        return this.unitRepository.findAll()
                .stream()
                .map(UnitResponse::new)
                .collect(Collectors.toList());
    }
}
