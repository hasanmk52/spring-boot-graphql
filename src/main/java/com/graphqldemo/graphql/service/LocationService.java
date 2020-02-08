package com.graphqldemo.graphql.service;

import com.graphqldemo.graphql.entity.Location;
import java.util.List;

public interface LocationService {
    List<Location> retrieveLocations();
}
