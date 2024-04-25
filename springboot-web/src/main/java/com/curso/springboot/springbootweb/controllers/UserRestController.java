package com.curso.springboot.springbootweb.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.curso.springboot.springbootweb.controllers.models.User;
import com.curso.springboot.springbootweb.controllers.models.dto.UserDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/path")
public class UserRestController {
    
    @GetMapping("/restDetails")
    public UserDto details() {
        User user =  new User("Andres", "Martinez");
        UserDto userDto = new UserDto();

        userDto.setUser(user);
        userDto.setTitle("Hola mundo");

        return userDto;
    }

}
