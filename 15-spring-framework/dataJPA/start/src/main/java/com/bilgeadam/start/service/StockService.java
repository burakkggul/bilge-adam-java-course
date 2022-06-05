package com.bilgeadam.start.service;

import com.bilgeadam.start.model.entity.Stock;
import com.bilgeadam.start.repository.StockRepository;
import com.bilgeadam.start.repository.projections.StockProjection;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Stock> findByBarcodeWithProjection(Long barcode){
        List<StockProjection> stocks = this.stockRepository.findByBarcode(barcode);

        Integer count = this.stockRepository.say();

        List<Stock> stockList = this.stockRepository.a(3005119297L);
        List<Stock> stockList2 = this.stockRepository.b(3005119297L);

        return stocks.stream().map(stockProjection -> {
            Stock stock = new Stock();
            stock.setBarcode(stockProjection.getBarcode());
            stock.setName(stockProjection.getName());
            return stock;
        }).collect(Collectors.toList());
    }
}
