package com.example.firstapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PayService {
    @Autowired
    TimeService timeService;

    @Autowired
    TypeService typeService;

    public double calcCost(int minutes, String type){
        return timeService.calcTime(minutes)*typeService.calcType(type);
    }
}
