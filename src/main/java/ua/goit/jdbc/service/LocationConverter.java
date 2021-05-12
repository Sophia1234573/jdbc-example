package ua.goit.jdbc.service;

import ua.goit.jdbc.dao.model.Location;
import ua.goit.jdbc.dto.LocationDto;

public class LocationConverter {
    public static Location toLocation(LocationDto locationDto) {
        return new Location(locationDto.getId(), locationDto.getStreetAddress(), locationDto.getPostalCode(),
                locationDto.getCity(), locationDto.getStateProvince());
    }

    public static LocationDto fromLocation(Location location) {
        return new LocationDto(location.getId(), location.getStreetAddress(), location.getPostalCode(),
                location.getCity(), location.getStateProvince());
    }
}
