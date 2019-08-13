package com.Spencer.CapstoneProject.controllers;

import com.Spencer.CapstoneProject.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping(value = "add")
    public String add(Model model, @ModelAttribute User user) {
        model.addAttribute(new User());
        model.addAttribute("title", "New User");
        return "user/add";
    }

}
