package com.bilgeadam.stoktakip.service;

import com.bilgeadam.stoktakip.model.dto.StockRequest;
import com.bilgeadam.stoktakip.model.dto.StockResponse;
import com.bilgeadam.stoktakip.model.entity.Stock;
import com.bilgeadam.stoktakip.repository.StockRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.text.DecimalFormat;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

@Service
public class StockService {

    private final StockRepository stockRepository;

    public StockService(StockRepository stockRepository){
        this.stockRepository = stockRepository;
    }

    public void save(StockRequest stockRequest){
        long stockCode = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        long barcode = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
        Stock stock = new Stock(stockRequest,stockCode,barcode);
        this.stockRepository.save(stock);
    }

    public List<StockResponse> findAll(){
        return this.stockRepository.findAll()
                .stream()
                .map(StockResponse::new)
                .collect(Collectors.toList());
    }

    public String getStatistics(){
        List<Stock> stocks = this.stockRepository.findAllSellAndBoughtPriceAndQuantity();
        AtomicReference<Double> profit = new AtomicReference<>();
        profit.set(0d);
        stocks.forEach(stock -> {
            profit.set(profit.get()+(stock.getSellPrice()-stock.getBoughtPrice()) * stock.getQuantity());
        });

        DecimalFormat df = new DecimalFormat("0.00");

        return df.format(profit.get());
    }

    public String getStatisticsFromDataSource(){
        Double profit = this.stockRepository.findProfitFromAllStocks();

        DecimalFormat df = new DecimalFormat("0.00");

        return df.format(profit);
    }

    public void delete(Long id) {
        this.stockRepository.delete(id);
    }

    public StockResponse findById(Long id) {
        /* Optional<Stock> optionalStock = this.stockRepository.findById(id);
        if(optionalStock.isPresent()){
            Stock stock = optionalStock.get();
            return new StockResponse(stock);
        }else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Bu id ile kayıt bulunamadı.");
        } */

        Stock stock = this.stockRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,"Bu id ile kayıt bulunamadı."));
        return new StockResponse(stock);
    }

    public StockResponse update(StockRequest stockRequest) {
        Stock savedStock = this.stockRepository.findById(stockRequest.getId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST,
                        "Stok kaydı bulunamadı. Id alanını kontrol edin."));
        Stock stock = new Stock(stockRequest, savedStock.getStockCode(), savedStock.getBarcode(), savedStock.getId());
        return new StockResponse(this.stockRepository.update(stock));
    }

    public void sell(Long barcode, Long stockCode) {
        if(this.stockRepository.isStockExists(barcode,stockCode)){
            // TODO stok var olduğu zaman ilgili kaydın quantity değerini 1 azaltarak kaydet.
        }else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Stok bulunamadı.");
        }
    }
}
