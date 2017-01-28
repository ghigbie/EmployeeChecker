package com.georgehigbie;

/**
 * Created by georgehigbie on 1/27/17.
 */
public class ConsultantFormerEmployee extends Employee {

    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String department;
    private String email;
    private String workCell;
    private int age;
    private int employeeCode;

    public ConsultantFormerEmployee(String firstName, String lastName, String dateOfBirth, String department, String email, String workCell, int age, int employeeCode, String firstName1, String lastName1, String dateOfBirth1, String department1, String email1, String workCell1, int age1, int employeeCode1) {
        super(firstName, lastName, dateOfBirth, department, email, workCell, age, employeeCode);
        this.firstName = firstName1;
        this.lastName = lastName1;
        this.dateOfBirth = dateOfBirth1;
        this.department = department1;
        this.email = email1;
        this.workCell = workCell1;
        this.age = age1;
        this.employeeCode = employeeCode1;
    }
}
