package Conditions;

import java.util.Scanner;

public class PracticeOfConditionsSwitches {
    public static void main(String[] args) {
        //Problem 1
        int a = 10;
        if (a >= 11) {
            System.out.println("i am not 10");
        }else {
            System.out.println("i am 10");
        }

        //Problem 2
       float m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your English marks");
        m1 = sc.nextFloat();

        System.out.println("Enter your Urdu marks");
        m2 = sc.nextFloat();

        System.out.println("Enter your Math marks");
        m3 = sc.nextFloat();

        float  avg = (m1+m2+m3)/3.0f;
        if (avg >= 40 && m1 >= 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("Your over all Percentage is " + avg);
            System.out.println("Congratulation, You are Promoted");
        }else {
            System.out.println("You are failed as usual");
        }

        //Problem 3

        System.out.println("Enter your Monthly Salary");
        int S1 = 0;
        S1 = sc.nextInt();
        if (S1 >=0 && S1 <= 2.5){
            System.out.println("You dont need to pay any tax");
        }
        else if (S1>=2.6 && S1 <= 5.0){
            System.out.println("You need to pay yor tax as 20 percent on it");
        }
        else if (S1 >= 5.1){
            System.out.println("You need to pay your tax as #0 percent on it");
        }

        //Problem 4
        System.out.println("Check days by entering the numbers from 1 to 7");
        int day = sc.nextInt();
        switch (day){
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
            case 7:
                System.out.println("Sunday");
        break;
        }

        //problem 5
        System.out.println("enter your website url");
        String website = sc.next();
        if (website.endsWith(".com")){
        System.out.println("This is commersial ");}
        else if (website.endsWith(".in")){
            System.out.println("This is indian website");
        }else if (website.endsWith(".pk")){
            System.out.println("This is pakistani Website");
        }
            }
        }