package com.bilgeadam.stoktakip.controller;

import com.bilgeadam.stoktakip.model.dto.StockRequest;
import com.bilgeadam.stoktakip.model.dto.StockResponse;
import com.bilgeadam.stoktakip.service.StockService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController {

    private final StockService stockService;

    public StockController(StockService stockService){
        this.stockService = stockService;
    }

    @PostMapping
    public ResponseEntity<Void> save(@RequestBody StockRequest stockRequest) throws URISyntaxException {
        this.stockService.save(stockRequest);
        return ResponseEntity.created(new URI("/stock")).build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.stockService.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping
    public ResponseEntity<List<StockResponse>> findAll(){
        return ResponseEntity.ok(this.stockService.findAll());
    }

    @GetMapping(params = "id")
    public ResponseEntity<StockResponse> findById(@RequestParam Long id){
        return ResponseEntity.ok(this.stockService.findById(id));
    }

    @PutMapping
    public ResponseEntity<StockResponse> update(@RequestBody StockRequest stockRequest){
        return ResponseEntity.ok(this.stockService.update(stockRequest));
    }
}
