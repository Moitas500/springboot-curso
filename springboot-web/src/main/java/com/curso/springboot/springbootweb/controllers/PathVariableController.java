package com.curso.springboot.springbootweb.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.curso.springboot.springbootweb.controllers.models.User;
import com.curso.springboot.springbootweb.controllers.models.dto.ParamDto;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @GetMapping("/example/{message}")
    public ParamDto example(@PathVariable String message) {
        ParamDto param = new ParamDto();

        return param;
    }

    @GetMapping("/mix/{product}/{name}")
    public Map<String, Object> mixPath(@PathVariable String product, @PathVariable String name) {
        Map<String, Object> json = new HashMap<>();

        json.put("product", product);
        json.put("name", name);

        return json;
    }
    
    @PostMapping("/create")
    public User create(@RequestBody User user) {
        
        return user;
    }
    
}
