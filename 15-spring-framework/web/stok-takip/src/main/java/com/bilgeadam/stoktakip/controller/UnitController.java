package com.bilgeadam.stoktakip.controller;

import com.bilgeadam.stoktakip.model.dto.UnitRequest;
import com.bilgeadam.stoktakip.model.dto.UnitResponse;
import com.bilgeadam.stoktakip.service.UnitService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/unit")
@RequiredArgsConstructor
public class UnitController {

    private final UnitService unitService;

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody UnitRequest unitRequest) throws URISyntaxException {
        this.unitService.save(unitRequest);
        return ResponseEntity.created(new URI("/unit")).build();
    }

    @GetMapping
    public ResponseEntity<List<UnitResponse>> findAll() {
        return ResponseEntity.ok(this.unitService.findAll());
    }
}
