package com.cydeo.repository;

import com.cydeo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    // Display all employees with email address '   '
    List<Employee> findByEmail(String email);

    // Display all employees with first_name '  ' and last_name '  ', also show all employees with an email address
    List<Employee> findByFirstNameAndLastNameOrEmail(String firstName, String lastName, String email);

    // Display all employees that first name is not ' '
    List<Employee> findByFirstNameIsNot(String firstName);

    // Display all employees where last name starts with ' '
    List<Employee> findByLastNameStartingWith(String pattern);

    // Display all employees with salaries higher than ' '
    List<Employee> findBySalaryGreaterThan(Integer salary);

    // Display all employees with salaries less than or equals to ' '
    List<Employee> findBySalaryIsLessThanEqual(Integer salary);

    // Display all employees that has been hired between '' and  ''
    List<Employee> findByHireDateBetween(LocalDate startDate, LocalDate endDate);

    // Display all employees where salaries greater and equal to '' in order
    List<Employee> findBySalaryIsGreaterThanEqualOrderBySalaryDesc(Integer salary);

    //Display top unique 3 employees that is making less than ''
    List<Employee> findDistinctTop3BySalaryIsLessThan(Integer salary);

    //Display all employees that do not have email address
    List<Employee> findByEmailIsNull();

    @Query("SELECT e FROM Employee e WHERE e.email = 'npointona@vistaprint.com'")
    Employee getEmployeesDetail();

    @Query("SELECT e.salary FROM Employee e WHERE e.email = 'csyversenn@aboutads.info'")
    Integer getEmployeeSalary();

    @Query("SELECT e FROM Employee e WHERE e.email =?1")
    Optional<Employee> getEmployeeDetail(String email);

    @Query("SELECT e FROM Employee e WHERE e.email =?1 AND e.salary =?2")
    Optional<Employee> getEmployeeDetail(String email, int salary);

    // not null
    @Query("SELECT e FROM Employee e WHERE e.salary <> ?1")
    List<Employee> getEmployeeSalaryNotEqual(int salary);

    // like/contain/startWith/endWith
    @Query("SELECT e FROM Employee e WHERE e.firstName LIKE ?1")
    List<Employee> getEmployeeFirstNameLike(String pattern);

    // less than
    @Query("SELECT e FROM Employee e WHERE e.salary < ?1")
    List<Employee> getEmployeeSalaryLessThan(int salary);

    // greater than
    @Query("SELECT e FROM Employee e WHERE e.salary > ?1")
    List<Employee> getEmployeeSalaryGreaterThan(int salary);

    // before
    @Query("SELECT e FROM Employee e WHERE e.hireDate > ?1")
    List<Employee> getEmployeeHireDateBefore(LocalDate date);

    // between
    @Query("SELECT e FROM Employee e WHERE e.salary BETWEEN ?1 AND ?2")
    List<Employee> getEmployeeSalaryBetween(int salary1, int salary2);

    // Null
    @Query("SELECT e FROM Employee e WHERE e.email IS NULL")
    List<Employee> getEmployeeEmailIsNull();

    // Not null
    @Query("SELECT e FROM Employee e WHERE e.email IS NOT NULL")
    List<Employee> getEmployeeEmailIsNotNull();

    // sorting in ascending order
    @Query("SELECT e FROM Employee e ORDER BY e.salary")
    List<Employee> getEmployeesSalaryInOrderAsc();

    // sorting in descending order
    @Query("SELECT e FROM Employee e ORDER BY e.salary DESC")
    List<Employee> getEmployeesSalaryInOrderDesc();

    // Native Query
    @Query(value = "SELECT * FROM employees WHERE salary ?1",nativeQuery = true)
    List<Employee> readEmployeeDetailBySalary(int salary);

    // @Query: Named Bind Parameter
    @Query("SELECT e FROM Employee e WHERE e.salary = :salary")
    List<Employee> getEmployeesSalary(@Param("salary") int salary);

    // enhancing the @Query_JPQL with @Modifying
    @Modifying
    @Transactional
    @Query("UPDATE Employee e SET e.email = 'admin@gmail.com' WHERE e.id=:id")
    void updateEmployeeJPQL(@Param("id") int id);

    // enhancing the @Query_Native with @Modifying
    @Modifying
    @Transactional
    @Query(value = "UPDATE employees SET email = 'admin@gmail.com' WHERE id=:id",nativeQuery = true)
    void updateEmployeeNativeQuery(@Param("id") int id);


}
