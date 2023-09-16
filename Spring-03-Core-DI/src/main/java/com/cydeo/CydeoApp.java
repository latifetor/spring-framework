package com.cydeo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {

        // Create the Spring Container
        // Create Configuration.class with @Configuration and then passing the Configuration
        // Stereotype_annotation: @ComponentScan in ConfigApp and @Component POJOs_classes
        // Spring: go to Configuration.class Scan all this package and whatever @Component create the Beans


        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);

        Java java = container.getBean(Java.class);

        java.getTeachingHours(); // Weekly teaching hours : 25



    }
}
