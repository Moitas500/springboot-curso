package com.curso.springboot.springbootweb.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.curso.springboot.springbootweb.controllers.models.User;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Andres", "Martinez");

        model.addAttribute("title", "Hola mundo");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/detail")
    public String detail(Map<String, Object> model) {
        model.put("title", "Hola mundo");
        model.put("name", "Cristhian");
        model.put("lastName", "Martinez");
        
        return "detail";
    }

}
