package com.bilgeadam.start.controller;

import com.bilgeadam.start.model.dto.UnitStockDTO;
import com.bilgeadam.start.model.entity.Unit;
import com.bilgeadam.start.service.UnitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/unit")
@RequiredArgsConstructor
public class UnitController {

    private final UnitService unitService;

    @PostMapping
    public Unit save(@RequestBody Unit unit){
        return this.unitService.save(unit);
    }

    @GetMapping
    public List<UnitStockDTO> findAll(){
        return this.unitService.findAll();
    }

    @GetMapping(params = "unitId")
    public UnitStockDTO findById(@RequestParam("unitId") Long id){
        return this.unitService.findById(id);
    }
}
