package Revision;

import java.util.Scanner;

public class ConditionsCh4 {
    public static void main(String[] args) {
        //Conditions
        //Decisions making instruction.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        if (age >= 18 && age <= 30) {
            System.out.println("You are able to drive.");
        } else if (age >= 31 && age < 50) {
            System.out.println("You are able to Drive 6 times a week");
        } else {
            System.out.println("You are not able to drive.");
        }

        //Switch case.
        int day = 2;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
        }
    }
}
