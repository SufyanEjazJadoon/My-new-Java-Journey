import java.util.Scanner;

public class JavaConditionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are adult");
        } else {
            System.out.println("You are child");

//Logical operators
            boolean a = true;
            boolean b = false;
            if (a && b) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
            System.out.println("For logical NOT");
            System.out.print("Not(a)is ");
            System.out.println(!a);
            System.out.print("Not(b)is");
            System.out.print(!b);
        }
    }
    }

