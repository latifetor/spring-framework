package com.cydeo.service;

import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.HoursRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SalaryService {

        EmployeeRepository employeeRepository;
        HoursRepository hourRepository;

    public SalaryService(EmployeeRepository employeeRepository, @Qualifier("RH") HoursRepository hourRepository) {
        this.employeeRepository = employeeRepository;
        this.hourRepository = hourRepository;
    }

    public void calculateRegularSalary(){
        System.out.println(employeeRepository.getHourlyRate() * hourRepository.getHours());
    }
}
