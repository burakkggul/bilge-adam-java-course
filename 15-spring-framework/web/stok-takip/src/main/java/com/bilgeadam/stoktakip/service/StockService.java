package com.bilgeadam.stoktakip.service;

import com.bilgeadam.stoktakip.repository.StockRepository;
import org.springframework.stereotype.Service;

@Service
public class StockService {

    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository){
        this.stockRepository = stockRepository;
    }

    public void save(){
        //this.stockRepository.save(new Stock());
    }
}
