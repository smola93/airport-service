package com.airportservice.Passenger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PassengerControler {

    @GetMapping(value = "/arrivals")
    String returnArrivals(Model model) {
        model.addAttribute("title", "Przyloty:");
        return ("arrivals");
    }

    @GetMapping(value = "/departures")
    String returnDepartures(Model model) {
        model.addAttribute("title", "Odloty:");
        return ("departures");
    }

    @GetMapping(value = "/flight-info")
    String returnFlightInfo(Model model) {
        model.addAttribute("title", "Kierunki lotów - Sezon LATO 2022:");
        return ("flight-info");
    }
}
