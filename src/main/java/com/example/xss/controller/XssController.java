package com.example.xss.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class XssController {


    @GetMapping("/xss")
    public void xss(@RequestParam("cookie") String cookie){
        System.out.println(cookie);
    }
}
