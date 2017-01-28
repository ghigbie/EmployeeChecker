package com.georgehigbie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        beginEntry();
    }

    public static void beginEntry(){
        String personTypePrompt = "Would you like to enter information for an Employee, a Contractor, a Consultant who was a former employee, or an intern?";
        String inputPrompt = "Please enter \"1\" for employee, \"2\" for contactor, \"3\" for consultant, \"4\" for intern.";
        System.out.println(personTypePrompt);
        System.out.println(inputPrompt;

        Scanner scanner = new Scanner(System.in);
        int employeeType = scanner.nextInt();

        String personTypeStatment = "You are entering data for a new ";
        String employee = "employee";
        String contractor = "contractor";
        String consultant = "consultant";
        String intern = "intern";

        switch (employeeType) {

            case (1):
                System.out.println(personTypeStatment + employee + ".");
                scanner.close();
                break;
            case (2):
                System.out.println(personTypeStatment + contractor + ".");
                scanner.close();
                break;
            case (3):
                System.out.println(personTypeStatment + consultant + ".");
                scanner.close();
                break;
            case (4):
                System.out.println(personTypeStatment + intern + ".");
                scanner.close();
                break;
            default:
                System.out.println("Please enter a valid choice.");
                System.out.println(personTypePrompt);
                System.out.println(inputPrompt);
                break;
        }


    }


}
