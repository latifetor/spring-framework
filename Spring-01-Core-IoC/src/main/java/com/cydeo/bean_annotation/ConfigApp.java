package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigApp {

    @Bean
    FullTimeMentor fullTimeMentor(){

        return new FullTimeMentor();
    }
    // @Bean(name = "p1") // gives name to the bean
    @Bean
    @Primary
    PartTimeMentor PartTimeMentor(){

        return new PartTimeMentor();
    }
    // @Bean(name = "p2")
    @Bean
    PartTimeMentor PartTimeMentor2(){

        return new PartTimeMentor();
    }
    // whenever create the beans
    // Rule: needs to create a method which is returning object that wanted
}
