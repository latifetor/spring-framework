package stereotype_annotations.Model;

import lombok.Data;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class DataStructure {

    @NonNull
    ExtraHours extraHours;

    //@Autowired = Spring version 4.3 only constructor for Dependency injection without annotation
//    public DataStructure(ExtraHours extraHours) {
//        this.extraHours = extraHours;
//    }

    public void getTotalHours(){
        System.out.println("Total hours: " + (40 + extraHours.getHours()));
    }

    // in order to use this ExtraHours_class inside another class
    // DataStructure_class need to "HAS" ExtraHours_class to call the method
    // for the HAS relationship, we need to do dependency injection: DI
    // Spring will create the DataStructure_object (Bean)
    // if the class itself has a dependency which is DataStructure HAS dependency with ExtraHours_class
    // or the class is a dependency of the other class, we need to use @Component
    // because it is part of the chain,
    // to be able to successfully create the DataStructure_class, Object or Beans, we also need the ExtraHours_Bean
    // because without ExtraHours_class it will not able be created
}
