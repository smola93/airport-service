package com.airportservice.Airport;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AirportControler {
    @GetMapping(value = "/commuting")
    String returnCommuting(Model model) {
        model.addAttribute("title", "Dojazd Samochodem:");
        return ("commuting");
    }

    @GetMapping(value = "/car-park")
    String returnCarPark(Model model) {
        model.addAttribute("title", "Parking:");
        return ("car-park");
    }
}
