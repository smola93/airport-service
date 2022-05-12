package com.airportservice.Home;

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
