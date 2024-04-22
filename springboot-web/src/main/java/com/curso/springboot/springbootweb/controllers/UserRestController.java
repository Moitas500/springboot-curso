package com.curso.springboot.springbootweb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class UserRestController {

    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    @GetMapping("/restDetails")
    public Map<String, Object> details() {
        Map<String, Object> body = new HashMap<>();
        
        body.put("title", "Hola mundo");
        body.put("name", "Cristhian");
        body.put("lastName", "Martinez");

        return body;
    }

}
