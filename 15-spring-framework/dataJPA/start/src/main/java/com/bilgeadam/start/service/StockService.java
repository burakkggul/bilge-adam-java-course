package com.bilgeadam.start.service;

import com.bilgeadam.start.model.entity.Stock;
import com.bilgeadam.start.repository.StockRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StockService {

    private final StockRepository stockRepository;

    public List<Stock> findAll() {
        return this.stockRepository.findAll();
    }

    public Stock save(Stock stock){
        return this.stockRepository.save(stock);
    }

    public List<Stock> findByQuantity(Integer quantity){
        return this.stockRepository.findByQuantity(quantity);
    }

    public List<Stock> findByQuantityLessThan(Integer quantity){
        return this.stockRepository.findByQuantityLessThan(quantity);
    }

    @Transactional
    public void deleteByBarcode(Long barcode){
        this.stockRepository.deleteByBarcode(barcode);
    }
}
