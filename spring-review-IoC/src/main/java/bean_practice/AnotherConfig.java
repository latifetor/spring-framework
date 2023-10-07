package bean_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AnotherConfig {

    @Bean("String 1") // create custom bean_name
    public String str1(){
        return "Welcome to Cydeo App";
    }
    //@Primary : clarified this bean will be used at all time when called
    @Bean // using default bean_name
    public String str2(){
        return "Spring Core Practice";
    }
}
