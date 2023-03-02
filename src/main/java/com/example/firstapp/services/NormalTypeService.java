package com.example.firstapp.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Primary
public class NormalTypeService implements TypeService{

    public double calcType(String type){
        if(type.equals("moto")){
            return 1;
        }else{
            return 2;
        }
    }
}
