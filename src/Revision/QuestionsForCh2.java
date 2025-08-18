package Revision;

import java.util.Scanner;

public class QuestionsForCh2 {
    public static void main(String[] args) {
        //find answer
        float b = 7 / 4 * 9 / 2;
        System.out.println(b);

        //encrypt and decrypt the grade.
        Scanner sc = new Scanner(System.in);
        System.out.println("My Grade is 2");
        System.out.println("Enter 8: ");
        int grade = sc.nextInt();
        System.out.println("My real grade is: " + (2 + grade));

        //check given num is greater than user entered number.
        int givennumber = 50;
        System.out.println("Enter any number: ");
        int usernum = sc.nextInt();
        if (givennumber > usernum) {
            System.out.println("Entered number " + usernum + " is smaller than given number(50)");
        } else {
            System.out.println("Enter number " + usernum + " is greter than given number(50)");
        }
        // formula
        System.out.println();
        int v = 2;
        int u = 2;
        int a = 1;
        int s = 1;
        System.out.println(((v * v) - (u * u)) / (2 * a * s));
        //find the value of c = ?
        System.out.println();
        System.out.println("value of c:");
        int x = 7;
        int c = 7 * 49 / 7 + 35 / 7;
        System.out.println(c);
    }
}
