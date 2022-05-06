package com.airportservice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControler {

    @GetMapping
    String returnHome(Model model) {
        model.addAttribute("title", "Witamy w aplikacji Airport-Service!");
        return ("home");
    }
}
