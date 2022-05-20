package com.airportservice.flight;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public List<Flight> listOrderByStartTime(FlightType type) {
        return flightRepository.findAllByTypeOrderByStartTimeAsc(type);
    }

    public List<Flight> listOrderByFinishTime(FlightType type) {
        return flightRepository.findAllByTypeOrderByFinishTimeAsc(type);
    }
}
