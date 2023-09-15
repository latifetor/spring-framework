package com.cydeo.sterotype_annotation;

// Requirement:
// 1. For Spring to create Beans from Agile.class, Java.class and Selenium.class
// 2. Whenever asking Spring to give the beans --> Container and Beans
// 3. Using Stereotype annotation

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        // creating Spring Container:
        // using one of the interface and use one of an implementation.class
        // based on the Configuration structure: working with the ConfigCourse.class

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigCourse.class);

        // all Beans are ready
        // using one of the method in Container.object
        // and pass the class_name (to get the Bean) in the parameter

        context.getBean(Java.class).getTeachingHours(); // Total teaching hours : 250



    }
}
