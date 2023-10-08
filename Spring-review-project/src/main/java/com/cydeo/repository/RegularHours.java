package com.cydeo.repository;

import org.springframework.stereotype.Component;

@Component
public class RegularHours implements HourRepository {

    @Override
    public int getHours() {
        return 40;
    }
}
