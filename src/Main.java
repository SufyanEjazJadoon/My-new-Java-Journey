import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of numbers");
        int num1 = 6;
        int num2 = 5;
        int num3 = 7;
        int sum = num1 + num2 + num3;
        System.out.println(sum);
        byte age = 32;
        long age2 = 20000L;
        char ch = 'A';
        float f1 = 5.2f;
        boolean a = true;
        String name = "sufyan";
        System.out.println(f1);
        System.out.println(a);
        System.out.println(name);

        //taking input new topic
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int c = sc.nextInt();
        System.out.println("Enter number 2");
        int d = sc.nextInt();
// aik baar "sum" use kiya ho to dubara use krna ho to us k pichay int na lgao
        sum = c + d;

        System.out.println("sum of both numbers");
       System.out.println(sum);

    }
}