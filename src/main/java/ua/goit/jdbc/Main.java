package ua.goit.jdbc;

import ua.goit.jdbc.config.DatabaseConnectionManager;
import ua.goit.jdbc.dao.DataAccessObject;
import ua.goit.jdbc.dao.LocationDao;
import ua.goit.jdbc.dao.model.Location;
import ua.goit.jdbc.dto.LocationDto;
import ua.goit.jdbc.service.LocationService;

public class Main {
    public static void main(String[] args) {

        DatabaseConnectionManager cm = new DatabaseConnectionManager("localhost",
                "go_it", "postgres", "Kolenka2011");

        LocationDto dto = new LocationDto(101, "Ukraine", "121345", "Kyiv", "Kyiv");

        DataAccessObject<Location> locationRepository = new LocationDao(cm);
        LocationService service = new LocationService(locationRepository);
        LocationDto locationDto = service.create(dto);
        System.out.println(locationDto);
    }
}
