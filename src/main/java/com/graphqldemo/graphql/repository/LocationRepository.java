package com.graphqldemo.graphql.repository;

import com.graphqldemo.graphql.entity.Location;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location, Long> {
}
