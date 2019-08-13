package com.Spencer.CapstoneProject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value="")
    public String index(Model model){

        model.addAttribute("title", "Music Gear Resale");

        return "home/index";
    }
}
