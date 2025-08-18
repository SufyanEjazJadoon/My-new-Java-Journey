package Revision;

import java.util.Scanner;

public class DataTypesCh1 {
    public static void main(String[] args) {
        //Variables.
        int Age = 10;
        System.out.println(Age);

        //DataType
        //Primitive Datatypes
        //Eight Primitive Data types

        //No 1
        System.out.println("Byte Data Type");
        Byte loss = -12;
        System.out.println(loss);

        //No 2
        System.out.println("short Data Type");
        short Loss = 121;
        System.out.println(Loss);

        //No 3
        System.out.println("float Data Type ");
        float Marks = 50.6f;
        System.out.println(Marks);

        //No 4
        System.out.println("int Data Type");
        int numbers = 500;
        System.out.println(numbers);

        //No 5
        System.out.println("long Data Type");
        double EarthKm = 6371.00877;
        long val = (long) EarthKm;
        System.out.println(val);

        //No 6
        System.out.println("char Data Type");
        char letter = 'A';
        System.out.println(letter);

        //No 7
        System.out.println("double Data Type");
        double distance = 5000123.1;
        System.out.println("Ditance from Abbottabad to Islamabad is: " + distance);

        //No 8
        System.out.println("boolean Data Type");
        boolean javagood = true;
        boolean flatearth = false;
        System.out.println("Java ki coding mazedaar hai: " + javagood);
        System.out.println("Zameen flat hai: " + flatearth);

        //Get user data
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
int age = scanner.nextInt();
        System.out.println("your age is: "+age);

    }
}
