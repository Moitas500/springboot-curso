package com.curso.springboot.springbootweb.controllers;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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

    @GetMapping("/list")
    public String list(ModelMap model) {
        List<User> users = Arrays.asList(
            new User("lalo", "pig"),
            new User("otro", "pig", "correo@com"),
            new User("pepa", "pig")
        );

        model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios");

        return "list";
    }
    

    @GetMapping("/detail")
    public String detail(Map<String, Object> model) {
        model.put("title", "Hola mundo");
        model.put("name", "Cristhian");
        model.put("lastName", "Martinez");
        
        return "detail";
    }

    @ModelAttribute("users")
    public List<User> userModels() {
        List<User> users = Arrays.asList(
            new User("lalo", "pig"),
            new User("otro", "pig", "correo@com"),
            new User("pepa", "pig")
        );

        return users;
    }

}
