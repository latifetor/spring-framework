package stereotype_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stereotype_annotations.Config.AppConfig;
import stereotype_annotations.Model.DataStructure;
import stereotype_annotations.Model.Microservice;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);

        DataStructure dsa = container.getBean(DataStructure.class);
        dsa.getTotalHours();  // Total hours: 40

        Microservice mcs = container.getBean(Microservice.class);
        mcs.getTotalHours();  // Total hours: 25

    }
}
