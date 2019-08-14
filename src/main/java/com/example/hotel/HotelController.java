package com.example.hotel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HotelController {

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("tagline","hello hotel");
        return "home";
    }
}
