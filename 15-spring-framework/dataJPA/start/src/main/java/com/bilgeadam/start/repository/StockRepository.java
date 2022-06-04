package com.bilgeadam.start.repository;

import com.bilgeadam.start.model.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StockRepository extends JpaRepository<Stock,Long> {

    // select * from stock where quantity = 500;
    List<Stock> findByQuantity(Integer quantity);

    // select * from stock where quantity = 500 limit 1;
    Optional<Stock> findTopByQuantity(Integer quantity);

    // select * from stock where quantity < 500;
    List<Stock> findByQuantityLessThan(Integer quantity);

    // select * from stock where quantity < 500;
    List<Stock> getByQuantityLessThan(Integer quantity);

    // delete from stock where barcode = x;
    void deleteByBarcode(Long barcode);

    // select * from stock where barcode = x order by quantity desc;
    List<Stock> findByBarcodeOrderByQuantityDesc(Long quantity);

    // select * from stock where barcode = x order by quantity asc;
    List<Stock> findByBarcodeOrderByQuantityAsc(Long quantity);

    //select * from stock where isAlive = true;
    Boolean findByIsAliveIsTrue();

    // select * from stock where isTrue=true;
    Optional<Stock> findByIsAliveTrue();

    // select * from stock where quantity in (5,6,7);
    List<Stock> findByQuantityIn(List<Integer> quantites);

    // select distinct(*) from stock where barcode = x;
    List<Stock> findDistinctByBarcode(Long barcode);

    // select distinct * from stock;
    List<Stock> findDistinct();

    // select distinct * from stock where barcode = a and stock_code = b;
    List<Stock> findDistinctByBarcodeAndStockCode(Long a , Long b);
}
