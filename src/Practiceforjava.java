
import java.util.Scanner;

public class Practiceforjava {
    public static void main(String[] args) {

//Simple write hello Mr Sufyan
        System.out.println("hello Mr Sufyan");

// Doing sum of three numbers
        int a = 10;
        int b = 20;
        int c = 30;
        int sum = a + b + c;
        System.out.println(sum);

        // Calculate Cgpa
        float Number1 = 68;
        float Number2 = 70;
        float Number3 = 70;
        float Cgpa = (Number1 + Number2 + Number3)/30;
        System.out.println("Your Cgpa is " + Cgpa);

        //Asking name and say hello
        System.out.println("What is your name");
     //   Scanner sc = new Scanner(System.in);
    //    String name = sc.next();
     //   System.out.println("Hello " + name + " How are you");

        // Cheak the User entered number is int or not
System.out.println("Enter Your Number");
Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());

        //Kilometers to miles
        System.out.println("Converts Kilometers to miles ");
    float F1 = 2;
    double miles = (F1)*0.6214;
        System.out.println(miles + " Miles");







    }
}
