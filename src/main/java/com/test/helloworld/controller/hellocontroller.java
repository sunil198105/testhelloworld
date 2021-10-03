package com.test.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class hellocontroller {

    @GetMapping("/")
    public String helloWorld()
    {
        return "HelloWorld";
    }
}
