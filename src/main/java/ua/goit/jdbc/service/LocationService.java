package ua.goit.jdbc.service;

import ua.goit.jdbc.dao.DataAccessObject;
import ua.goit.jdbc.dao.LocationDao;
import ua.goit.jdbc.dao.model.Location;
import ua.goit.jdbc.dto.LocationDto;

public class LocationService {
    private DataAccessObject<Location> repository;

    public LocationService(DataAccessObject<Location> repository) {
        this.repository = repository;
    }

    public LocationDto create(LocationDto locationDto) {
        Location location = LocationConverter.toLocation(locationDto);
        Location savedLocation = repository.create(location);
        return LocationConverter.fromLocation(savedLocation);
    }
}
