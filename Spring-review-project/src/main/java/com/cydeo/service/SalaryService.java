package com.cydeo.service;

import com.cydeo.repository.EmployeeRepository;
import com.cydeo.repository.HourRepository;
import org.springframework.stereotype.Component;

@Component
public class SalaryService {

        EmployeeRepository employeeRepository;
        HourRepository hourRepository;

    public SalaryService(EmployeeRepository employeeRepository, HourRepository hourRepository) {
        this.employeeRepository = employeeRepository;
        this.hourRepository = hourRepository;
    }

    public void calculateRegularSalary(){
        System.out.println((employeeRepository.getHourlyRate() * hourRepository.getHours()));
    }
}
