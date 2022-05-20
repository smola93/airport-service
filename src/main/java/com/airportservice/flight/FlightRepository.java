package com.airportservice.flight;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface FlightRepository extends Repository<Flight, Integer> {

    List<Flight> findAllByTypeOrderByStartTimeAsc(FlightType type);

    List<Flight> findAllByTypeOrderByFinishTimeAsc(FlightType type);
}
