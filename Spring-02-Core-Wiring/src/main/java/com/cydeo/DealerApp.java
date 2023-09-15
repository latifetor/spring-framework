package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Requirement:
// Create Spring Container and add some Beans inside for person.class and Car.class
// Let Spring Providing objects for working on actions
// Using @Bean annotation
public class DealerApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCar.class);

        Car c = container.getBean(Car.class);
        Person p = container.getBean(Person.class);

        System.out.println("Person's name : " + p.getName());   // Person's name : Mike
        System.out.println("Car's make : " + c.getMake());      // Car's make : Honda
        //System.out.println("Person's car : " + p.getCar();    // Person's car : Null
            // because Person.object does not know that this car object belong to itself
            // has to define which Car_object belongs to Person_name
            // if any object has a relationship or dependency to other object
            // has to be managed, otherwise Spring does not know

        System.out.println("Person's car : " + p.getCar().getMake()); // Person's car : Honda




    }
}