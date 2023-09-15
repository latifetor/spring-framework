package com.cydeo.sterotype_annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
// @ComponentScan :
@ComponentScan(basePackages = "com.cydeo")
      // in case of creating Bean that belongs to a different package
      // using @ComponentScan( )

public class ConfigCourse {

}

