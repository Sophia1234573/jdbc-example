package ua.goit.jdbc.dao;

import ua.goit.jdbc.config.DatabaseConnectionManager;
import ua.goit.jdbc.dao.model.Location;

import java.sql.Connection;

public class LocationDao implements DataAccessObject<Location> {
    private final DatabaseConnectionManager connectionManager;
    public LocationDao(DatabaseConnectionManager connectionManager) {
        this.connectionManager = connectionManager;
    }

    @Override
    public Location findById(Integer id) {
        return null;
    }

    @Override
    public Location create(Location entity) {
        return null;
    }
}
