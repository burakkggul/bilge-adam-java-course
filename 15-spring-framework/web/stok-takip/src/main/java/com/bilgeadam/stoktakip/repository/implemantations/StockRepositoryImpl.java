package com.bilgeadam.stoktakip.repository.implemantations;

import com.bilgeadam.stoktakip.model.entity.Stock;
import com.bilgeadam.stoktakip.repository.StockRepository;
import com.bilgeadam.stoktakip.repository.base.CrudRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class StockRepositoryImpl implements StockRepository {
    private final Logger logger = LoggerFactory.getLogger(StockRepositoryImpl.class);

    private final Connection connection;

    public StockRepositoryImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void save(Stock stock) {
        String sql = "insert into stock(" +
                "name," +
                "quantity," +
                "bought_price," +
                "sell_price," +
                "stock_code," +
                "barcode," +
                "unit_id" +
                ") values (?,?,?,?,?,?,?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, stock.getName());
            statement.setInt(2, stock.getQuantity());
            statement.setDouble(3, stock.getBoughtPrice());
            statement.setDouble(4, stock.getSellPrice());
            statement.setLong(5, stock.getBarcode());
            statement.setLong(6, stock.getUnitId());
            statement.executeUpdate();
            logger.info(stock.getBarcode() + " barkodlu stok kaydı başarıyla yapıldı.");
        } catch (SQLException e) {
            logger.error("Kayıt atılırken bir hata oluştu." +
                    " SQL State: " + e.getSQLState() +
                    " Reason: " + e.getMessage());
        }
    }

    @Override
    public List<Stock> findAll() {
        String sql = "select * from stock;";
        List<Stock> stocks = new ArrayList<>();
        try (Statement statement = this.connection.createStatement()) {
            statement.executeQuery(sql);
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                stocks.add(new Stock(resultSet));
            }
            logger.info("Stoklar başarıyla getirildi.");
        } catch (SQLException e) {
            logger.error("Kayıt atılırken bir hata oluştu." +
                    " SQL State: " + e.getSQLState() +
                    " Reason: " + e.getMessage());
        }
        return stocks;
    }

    @Override
    public Optional<Stock> findById(Long id) {
        String sql = "select * from stock where id = " + id;

        try (Statement statement = this.connection.createStatement()) {
            statement.executeQuery(sql);
            ResultSet resultSet = statement.getResultSet();

            if (resultSet.next()) {
                return Optional.of(new Stock(resultSet));
            }
            logger.info(id + "'id li stok başarıyla getirildi.");
        } catch (SQLException e) {
            logger.error("Kayıt atılırken bir hata oluştu." +
                    " SQL State: " + e.getSQLState() +
                    " Reason: " + e.getMessage());
        }
        return Optional.empty();
    }

    @Override
    public void update(Stock stock) {
        String sql = "update stock set " +
                "name=?, " +
                "quantity=?, " +
                "bought_price= ?, " +
                "sell_price= ?, " +
                "stock_code= ?, " +
                "barcode= ?, " +
                "unit_id= ? " +
                "where id = ?";

        try (PreparedStatement statement = this.connection.prepareStatement(sql)) {
            statement.setString(1, stock.getName());
            statement.setInt(2, stock.getQuantity());
            statement.setDouble(3, stock.getBoughtPrice());
            statement.setDouble(4, stock.getSellPrice());
            statement.setLong(5, stock.getBarcode());
            statement.setLong(6, stock.getUnitId());
            statement.setLong(7, stock.getId());
            statement.executeUpdate();
            logger.info(stock.getBarcode() + " barkodlu stok başarıyla güncelledi.");
        } catch (SQLException e) {
            logger.error("Kayıt atılırken bir hata oluştu." +
                    " SQL State: " + e.getSQLState() +
                    " Reason: " + e.getMessage());
        }
    }

    @Override
    public void delete(Long id) {
        String sql = "delete from stock where id = " + id;

        try (Statement statement = this.connection.createStatement()) {
            statement.executeQuery(sql);
            logger.info(id + " numaralı kayıt başarıyla silindi.");
        } catch (SQLException e) {
            logger.error("Kayıt atılırken bir hata oluştu." +
                    " SQL State: " + e.getSQLState() +
                    " Reason: " + e.getMessage());
        }
    }
}
