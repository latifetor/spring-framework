package com.cydeo.repository;

import com.cydeo.model.Employee;

public class DBEmployeeRepository implements EmployeeRepository{

    //Assume we are getting this data from the db
    @Override
    public int getHourlyRate() {

        Employee employee = new Employee("Jennifer","IT",70);
        return employee.getHourlyRate();
    }
}
