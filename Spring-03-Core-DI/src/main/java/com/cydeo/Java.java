package com.cydeo;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*
    Requirement: to see the weekly teaching hours
    In Java, when we teach in addition to class hour, we do office hour
    PO wants to reflect those hour as well in this calculation
    DEV then create OfficeHour.class
        -- Java.class getTeachingHour() calculation should include officeHour( ) as well
        -- in order to call officeHour() method by calling officeHour.object.getHour()
        -- then need to create the dependency,
        -- Java has dependency and Jva_object needs to use officeHours_object
 */
@Component
@AllArgsConstructor
public class Java {

// Spring injected officeHours_object to Java.class
// Using 1) Field Injection: by putting @Autowired on top of the field

//    @Autowired
//    OfficeHours officeHours;

// Using 2) Constructor Injection: by generating the Constructor and put @Autowired top of Constructor
    OfficeHours officeHours;

//    @Autowired
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours(){
        System.out.println("Weekly teaching hours : " + (20 + officeHours.getHours()));


    }
}
