package com.georgehigbie;

/**
 * Created by georgehigbie on 1/27/17.
 */
public class Employee {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String department;
    private String email;
    private String workCell;
    private int age;
    private int employeeCode;

    public Employee(String firstName, String lastName, String dateOfBirth, String department, String email, String workCell, int age, int employeeCode) {
        this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
        this.lastName = lastName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
        this.dateOfBirth = dateOfBirth;
        this.department = department.substring(0,1).toUpperCase() + department.substring(1).toLowerCase();
        this.email = email;
        this.workCell = workCell;
        this.age = age;
        this.employeeCode = employeeCode;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }
}
