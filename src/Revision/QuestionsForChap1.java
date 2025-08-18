package Revision;

import java.util.Scanner;

public class QuestionsForChap1 {
    public static void main(String[] args) {
        //Sum of Three numbers
        int a = 5;
        int b = 10;
        int c = 15;
        System.out.println(a + b + c);

        // Cgpa of three subjects
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your Three subjects numbers");
        System.out.println("English (out of 100)");
        int Eng = scanner.nextInt();
        System.out.println("Urdu (out of 100)");
        int Urdu = scanner.nextInt();
        System.out.println("Math (out of 100)");
        int Math = scanner.nextInt();
        double Percentage = (Eng+Urdu+Math)/3.0;
        double Cgpa = (Percentage/100)*4.0;
        System.out.println("Your Percentage is: "+ Percentage);
        System.out.println("Your Cgpa is: "+ Cgpa);

        //say hello to user
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("hey "+name+" Have a good day.");

        //kilometer to miles.
        System.out.println("Convert kilometer into miles");
        System.out.println("Enter kilometers: ");
        int k = scanner.nextInt();
        double miles = k*0.621371;
        System.out.println(miles);

        //check that user input is integer or not
        System.out.println("Enter your number: ");
        if (scanner.hasNextInt()){
            int num = scanner.nextInt();
            System.out.println("This number is integer: "+ num);
        }
        else {
            System.out.println("This is not integer");
        }



    }
}
