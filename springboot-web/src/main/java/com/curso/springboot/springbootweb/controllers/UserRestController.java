package com.curso.springboot.springbootweb.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.curso.springboot.springbootweb.controllers.models.User;
import com.curso.springboot.springbootweb.controllers.models.dto.UserDto;

import java.util.Arrays;
import java.util.List;

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

    @GetMapping("/list")
    public List<User> list() {
        User user = new User("Andres3", "Martinez2");
        User user2 = new User("Andres2", "Martinez3");
        User user3 = new User("Andres", "Martinez");

        List<User> users = Arrays.asList(user, user2, user3);

        return users;
    }

}
