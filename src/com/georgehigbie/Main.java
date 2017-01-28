package com.georgehigbie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        beginEntry();
    }

    public static void beginEntry(){
        Scanner scanner = new Scanner(System.in);
        int employeeType = scanner.nextInt();

        System.out.println("Would you like to enter information for an Employee, a Contractor, a Consultant who was a former employee, or an intern?");
        System.out.println("Please enter \"1\" for employee, \"2\" for contactor, \"3\" for consultant, \"4\" for intern.");

        String personTypeStatment = "You are entering data for a new ";
        String employee = "employee";
        String contractor = "contractor";
        switch (employeeType) {

            case (1):
                System.out.println("You are entering data for a new employee.");
                break;
            case (2):
                System.out.println("You are entering data for a new contractor.");
                break;
            case (3):
                System.out.println("You are entering data for a new consultant.");
                break;
            case (4):
                System.out.println("You are entering data for a new intern.");
                break;
            case (default):
                System.out.println("Please enter a valid choice.");
                break;
        }


        }

    }
}
