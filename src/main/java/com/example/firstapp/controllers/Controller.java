package com.example.firstapp.controllers;

import com.example.firstapp.services.PayService;
import com.example.firstapp.services.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    PayService payService;

    @Autowired
    TypeService typeService;

    @GetMapping("/hello/{name}")
    public String hello(
            @PathVariable("name") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/calc-cost")
    public double calcCost(
            @RequestParam(name= "type", defaultValue = "moto") String type,
            @RequestParam(name= "minutes", defaultValue = "0") int minutes) {
        return payService.calcCost(minutes, type);
    }

    @GetMapping("/price-by-type")
    public double privceByType(
            @RequestParam(name= "type", defaultValue = "moto") String type) {
        return typeService.calcType(type);
    }
}
