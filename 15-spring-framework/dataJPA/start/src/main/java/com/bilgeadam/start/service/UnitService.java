package com.bilgeadam.start.service;

import com.bilgeadam.start.model.dto.StockWithoutUnitDTO;
import com.bilgeadam.start.model.dto.UnitStockDTO;
import com.bilgeadam.start.model.entity.Unit;
import com.bilgeadam.start.repository.UnitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UnitService {
    private final UnitRepository unitRepository;

    public Unit save(Unit unit){
        return this.unitRepository.save(unit);
    }

    public List<UnitStockDTO> findAll() {
        List<Unit> units = this.unitRepository.findAll();
        return units.stream()
                .map(this::stockMapToStockUnitDTO)
                .collect(Collectors.toList());
    }

    public UnitStockDTO stockMapToStockUnitDTO(Unit unit){
        UnitStockDTO unitStockDTO = new UnitStockDTO(unit);
        List<StockWithoutUnitDTO> stockWithoutUnitDTOS = unit.getStocks().stream().
                map(StockWithoutUnitDTO::new)
                .collect(Collectors.toList());
        unitStockDTO.setStocks(stockWithoutUnitDTOS);
        return unitStockDTO;
    }

    public UnitStockDTO findById(Long id) {
        Optional<Unit> unit = this.unitRepository.findById(id);
        if(unit.isPresent()){
            Unit unit1 = unit.get();
            return this.stockMapToStockUnitDTO(unit1);
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"id ile unit bulunamadı.");
        }
    }
}
