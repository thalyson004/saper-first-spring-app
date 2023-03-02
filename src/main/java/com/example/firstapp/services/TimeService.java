package com.example.firstapp.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class TimeService {
    public double calcTime(int minutes){
        return Math.ceil(minutes/15.0);
    }
}
