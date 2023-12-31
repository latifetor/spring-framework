package com.cydeo.bootstrap;

import com.cydeo.repository.CourseRepository;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.RegionRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    private final RegionRepository regionRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    private final CourseRepository courseRepository;

    public DataGenerator(RegionRepository regionRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository, CourseRepository courseRepository) {
        this.regionRepository = regionRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
        this.courseRepository = courseRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("-------------REGION------------");

        System.out.println("findByCountry:" + regionRepository.findByCountry("Canada"));
        System.out.println("findDistinctByCountry: " + regionRepository.findDistinctByCountry("Canada"));
        System.out.println("findByCountryIsContaining: " + regionRepository.findByCountryIsContaining("United"));
        System.out.println("findByCountryIsContainingOrderByCountry = " + regionRepository.findByCountryIsContainingOrderByCountry("Asia"));
        System.out.println("findTopTwoByCountry = " + regionRepository.findTopTwoByCountry("Canada"));
        System.out.println("findTop2ByCountry = " + regionRepository.findTop2ByCountry("Canada"));

        System.out.println("-------------DEPARTMENT------------");

        System.out.println("findByDepartment = " + departmentRepository.findByDepartment("Toys"));
        System.out.println("findByDivisionIs = " + departmentRepository.findByDivisionIs("Outdoors"));
        System.out.println("findByDivisionEquals = " + departmentRepository.findByDivisionEquals("Outdoors"));
        System.out.println("findDistinctTop3ByDivisionContains = " + departmentRepository.findDistinctTop3ByDivisionContains("Hea"));

        System.out.println("-------------EMPLOYEE------------");

        System.out.println("findByEmail = " + employeeRepository.findByEmail("btrow5@technorati.com"));
        System.out.println("findByFirstNameAndLastNameOrEmail = " + employeeRepository.findByFirstNameAndLastNameOrEmail("Annora","Bendelow","abendelowg@google.com.hk"));
        //System.out.println("findDistinctTop3BySalaryIsLessThan = " + employeeRepository.findDistinctTop3BySalaryIsLessThan(100000));
        //System.out.println("findByEmailIsNull = " + employeeRepository.findByEmailIsNull());
        //System.out.println("findBySalaryIsGreaterThanEqualOrderBySalaryDesc = " + employeeRepository.findBySalaryIsGreaterThanEqualOrderBySalaryDesc(120000));
        //System.out.println("findByLastNameStartingWith = "+employeeRepository.findByLastNameStartingWith("E"));

        System.out.println("-------------EMPLOYEE with JPQL------------");

        System.out.println("getEmployeesDetail = " + employeeRepository.getEmployeesDetail());
        System.out.println("getEmployeeSalary = " + employeeRepository.getEmployeeSalary());

        System.out.println("-------------COURSE------------");

        courseRepository.findByCategory("Spring").forEach(System.out::println);
        System.out.println("---------------");

        courseRepository.findByCategoryOrderByName("Spring").forEach(System.out::println);
        System.out.println("---------------");

        System.out.println(courseRepository.existsByName("JavaScript for All"));
        System.out.println("---------------");

        System.out.println(courseRepository.countByCategory("Spring"));
        System.out.println("---------------");

        courseRepository.findByNameStartsWith("Scalable").forEach(System.out::println);
        System.out.println("---------------");

        //courseRepository.streamByCategory("Spring").forEach(System.out::println);


    }
}
