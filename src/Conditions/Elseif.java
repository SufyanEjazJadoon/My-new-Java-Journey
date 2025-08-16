package Conditions;

import java.util.Scanner;

public class Elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        // Age check
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age >= 60) {
            System.out.println("You are above 60 Years");
        } else if (age >= 40) {
            System.out.println("You are above 40 years");
        } else if (age >= 30) {
            System.out.println("You are above 30 years");
        } else {
            System.out.println("You are too young");
        }

        // Switch case for day
        System.out.println("Enter a number from 1 to 6");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid input! Please enter a number from 1 to 6");
                break;
        }

        // Close the Scanner
        sc.close();
    }
}