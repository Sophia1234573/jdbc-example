package ua.goit.jdbc.service;

import ua.goit.jdbc.dao.model.Location;
import ua.goit.jdbc.dto.LocationDto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LocationConverter {
    public static Location toLocation(LocationDto locationDto) {
        return new Location(locationDto.getId(), locationDto.getStreetAddress(), locationDto.getPostalCode(),
                locationDto.getCity(), locationDto.getStateProvince());
    }

    public static LocationDto fromLocation(Location location) {
        return new LocationDto(location.getId(), location.getStreetAddress(), location.getPostalCode(),
                location.getCity(), location.getStateProvince());
    }

    public static Location toLocation(ResultSet resultSet) throws SQLException {
        Location location = new Location();
        while (resultSet.next()) {
            location.setId(resultSet.getInt("location_id"));
            location.setStreetAddress(resultSet.getString("street_address"));
            location.setPostalCode(resultSet.getString("postal_code"));
            location.setCity(resultSet.getString("city"));
            location.setStateProvince(resultSet.getString("state_province"));
        }
        return location;
    }
}
