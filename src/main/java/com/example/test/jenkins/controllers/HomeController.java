package com.example.test.jenkins.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HomeController {

    @Value("${test-string:In default}")
    private String testString;

    @GetMapping("/")
    public String home() {
        Date currentTime = new Date();
        return currentTime.toString();
    }

    @GetMapping("/value")
    public String value() {
        return testString;
    }
}
