package com.bilgeadam.stoktakip.repository.implemantations;

import com.bilgeadam.stoktakip.model.entity.Unit;
import com.bilgeadam.stoktakip.repository.UnitRepository;
import com.bilgeadam.stoktakip.repository.base.CrudRepository;

import java.util.List;
import java.util.Optional;

public class UnitRepositoryImpl implements UnitRepository {
    @Override
    public void save(Unit unit) {

    }

    @Override
    public List<Unit> findAll() {
        String sql = "select * from unit;";
        List<Unit> units = new ArrayList<>();
        try (Statement statement = this.connection.createStatement()) {
            statement.executeQuery(sql);
            ResultSet resultSet = statement.getResultSet();
            while (resultSet.next()) {
                units.add(new Unit(resultSet));
            }
        } catch (SQLException e) {
            logger.error("Kayit alirken bir hata olustu" +
                    "SQL State: " + e.getSQLState() +
                    "Reason: " + e.getMessage());
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return units;
    }

    @Override
    public Optional<Unit> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void update(Unit unit) {

    }

    @Override
    public void delete(Long id) {

    }
}
