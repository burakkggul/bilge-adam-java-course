package com.bilgeadam.start.controller;

import com.bilgeadam.start.model.entity.Stock;
import com.bilgeadam.start.service.StockService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/stock")
@RequiredArgsConstructor
public class StockController {

    private final StockService stockService;

    @GetMapping
    public ResponseEntity<List<Stock>> findAll(){
        return ResponseEntity.ok(this.stockService.findAll());
    }

    @PostMapping
    public ResponseEntity<Stock> save(@RequestBody Stock stock){
        return ResponseEntity.ok(this.stockService.save(stock));
    }

    @GetMapping(params = "quantity")
    public ResponseEntity<List<Stock>> findByQuantity(@RequestParam Integer quantity){
        return ResponseEntity.ok(this.stockService.findByQuantity(quantity));
    }

    @GetMapping(params = "quantityLessThan")
    public ResponseEntity<List<Stock>> findByQuantityLessThan(@RequestParam Integer quantityLessThan){
        return ResponseEntity.ok(this.stockService.findByQuantityLessThan(quantityLessThan));
    }

    @GetMapping(params = "barcode")
    public ResponseEntity<Void> findByQuantityLessThan(@RequestParam Long barcode){
        this.stockService.deleteByBarcode(barcode);
        return ResponseEntity.ok().build();
    }
}
