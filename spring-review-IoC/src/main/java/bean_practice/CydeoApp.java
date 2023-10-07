package bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

    /* How to create a Spring container
       -> using ApplicationContext_interface
       -> creating container which class will take based on to create
       -> providing which configuration_class will be used as a based class
       -> if there is any @Bean annotated at those methods then adding those methods to the container
    */
        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

        FullTimeEmployee fullTimeEmployee = container.getBean(FullTimeEmployee.class);
        fullTimeEmployee.createAccount();
          // FullTimeEmployee is holding the Bean(object) which comes from container

        PartTimeEmployee partTimeEmployee = container.getBean(PartTimeEmployee.class);
        partTimeEmployee.createAccount();


    }
}
