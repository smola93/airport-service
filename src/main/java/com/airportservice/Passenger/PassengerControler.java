package com.airportservice.Passenger;

import com.airportservice.flight.FlightService;
import com.airportservice.flight.FlightType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PassengerControler {

    private final FlightService flightService;

    public PassengerControler(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping(value = "/arrivals")
    String returnArrivals(Model model) {
        model.addAttribute("title", "Przyloty:");
        model.addAttribute("flights", flightService.listOrderByFinishTime(FlightType.PRZYLOTY));
        return ("arrivals");
    }

    @GetMapping(value = "/departures")
    String returnDepartures(Model model) {
        model.addAttribute("title", "Odloty:");
        model.addAttribute("flights", flightService.listOrderByStartTime(FlightType.ODLOTY));
        return ("departures");
    }

    @GetMapping(value = "/flight-info")
    String returnFlightInfo(Model model) {
        model.addAttribute("title", "Kierunki lotów - Sezon LATO 2022:");
        return ("flight-info");
    }

    @GetMapping(value = "/before-flight")
    String returnBeforeFlightPage(Model model) {
        model.addAttribute("title", "Zanim ruszysz w podróż:");
        return ("before-flight");
    }
}
