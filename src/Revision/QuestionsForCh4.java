package Revision;

import java.util.Scanner;

public class QuestionsForCh4 {
    public static void main(String[] args) {
        //check child or adult
        int age = 19;
        if (age >= 18) {
            System.out.println("You are adult");
        } else {
            System.out.println("You are child");
        }
        //check Student is pass or fail
        Scanner scanner = new Scanner(System.in);
        System.out.println("Check your result");
        System.out.println("Enter your English marks");
        int M1 = scanner.nextInt();
        System.out.println("Enter your Math marks");
       int M2 = scanner.nextInt();
        System.out.println("Enter your Science marks");
       int M3 = scanner.nextInt();
        float avg = (M1 + M2 + M3/3.0f);
        if (avg >=40 && M1 >= 33 && M2 >= 33 && M3 >= 33) {
            System.out.println("You are passed");
        } else {
            System.out.println("You are Failed");
        }
  //check the Type of website
        System.out.print("Enter your website link Here: ");
        String Web = scanner.next();
        if (Web.endsWith(".org")) {
            System.out.println("This is organization website");
        }else if (Web.endsWith(".pk")){
                System.out.println("This is pakistani website");
            } else if (Web.endsWith(".in")) {
            System.out.println("This is pakistani website");
        }else {
            System.out.println("Unknown Website");
        }

    }
}