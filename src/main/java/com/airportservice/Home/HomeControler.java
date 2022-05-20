package com.airportservice.Home;

import com.airportservice.flight.FlightService;
import com.airportservice.flight.FlightType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeControler {

    private final FlightService flightService;

    public HomeControler(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping
    String returnHome(Model model) {
        model.addAttribute("title", "Witamy w aplikacji Airport-Service!");
        model.addAttribute("flights", List.of(flightService.listOrderByStartTime(FlightType.ODLOTY).get(0)));
        return ("home");
    }

    @GetMapping(value = "/about")
    String returnAbout(Model model) {
        model.addAttribute("title", "O Aplikacji:");
        return ("about");
    }

    @GetMapping(value = "/contact")
    String returnContact(Model model) {
        model.addAttribute("title", "Kontakt:");
        return ("contact");
    }
}
