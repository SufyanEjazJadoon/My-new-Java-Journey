package Conditions;

import java.util.Scanner;

public class FindLeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        // Taking year input from user
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        // Checking leap year conditions
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
