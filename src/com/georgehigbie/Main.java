package com.georgehigbie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        beginEntry();
    }

    public static void beginEntry(){
        Scanner scanner = new Scanner(System.in);
        String employeeType = scanner.next().toLowerCase();

        System.out.println("Would you like to enter information for an Employee, a Contractor, a Consultant who was a former employee, or an intern?");
        System.out.println("Please enter \"E\" for employee, \"CONTR\" for contactor, \"CONS\" for consultant, \"I\" for intern.");


    }
}
