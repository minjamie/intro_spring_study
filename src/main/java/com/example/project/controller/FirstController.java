package com.example.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public  String niceToMeetYou(Model model){
        model.addAttribute("username", "minjae");
        return "greetings";
    }

    @GetMapping("/bye")
    public String seeYoNext(Model model){
        model.addAttribute("nickname", "kim");
        return "goodbye";
    }
}
