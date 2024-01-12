package com.example.provaTeamTriplaAAA.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TestController {

    @GetMapping
    public String index (Model model) {
        model.addAttribute("ciao", "ciao");
        return "home";
    }
}
