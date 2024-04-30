package com.curso.springboot.springbootweb.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.curso.springboot.springbootweb.controllers.models.dto.ParamDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/params")
public class RequestParamController {

    @GetMapping("/example")
    public ParamDto example(@RequestParam String message) {
        ParamDto param = new ParamDto();

        param.setMessage(message != null ? message : "No hay mensaje");

        return param;
    }
    
    @GetMapping("/bar")
    public ParamDto bar(@RequestParam() String text, @RequestParam Integer code) {
        
        ParamDto params = new ParamDto();
        
        params.setMessage(text);
        params.setCode(code);

        return params;

    }
    
    @GetMapping("/request")
    public ParamDto request(HttpServletRequest request) {
        
        ParamDto parms = new ParamDto();

        parms.setCode(Integer.parseInt(request.getParameter("code")));
        parms.setMessage(request.getParameter("message"));

        return parms;
    }
    

}
