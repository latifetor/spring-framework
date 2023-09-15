package com.cydeo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// using @Bean_annotation approach
@Configuration
public class ConfigCar {

    @Bean
    Car car(){
        Car c = new Car();
        c.setMake("Honda");
        return c;
    }
//using Direct Wiring
//    @Bean
//    Person person(){
//        Person p = new Person();
//        p.setName("Mike");
//        p.setCar(car());
//           // directly calling @Bean annotated method from the other @Bean annotation method: car()
//           // that defines the 2nd Bean of the relationship
//        return p;

// using Autowiring
    // pass as a method parameter
    // instead of calling the method, pass as an argument

    @Bean
    Person person(Car car){
        Person p = new Person();
        p.setName("Mike");
        p.setCar(car);
        return p;

    }
}