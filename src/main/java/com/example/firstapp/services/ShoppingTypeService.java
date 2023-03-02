package com.example.firstapp.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class ShoppingTypeService implements TypeService {

    public double calcType(String type) {
        if(type.equals("moto")){
            return 3;
        }else{
            return 5;
        }
    }
}
