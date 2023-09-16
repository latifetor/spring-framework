package com.cydeo;

import org.springframework.stereotype.Component;

@Component
public class OfficeHours {

    public int getHours(){
        return 5;
        // it might be different calculation, based on the business logic
    }
}
