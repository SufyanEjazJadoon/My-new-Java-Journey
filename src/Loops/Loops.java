package Loops;

public class Loops {
    public static void main(String[] args) {

        //While loop
        System.out.println("While loop ");
        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }

        System.out.println("New ");
       int b = 10;
        while (b <=50) {
            System.out.println(b);
            b++;

    }
// do while loop
        System.out.println(" ");
        System.out.println("Do while loop");
        System.out.println(" ");
        int b1 = 5;
        do {
            System.out.println(b1);
            b1 ++;
        }
        while (b1<= 15);

        System.out.println( " New question");
        int c = 0;
        do {
            System.out.println(c);
            c ++;
        }while (c <= 21);

        // for loop
        System.out.println("for Loop");
for ( int c1 = 1; c1 <= 10; c1 ++) {
            System.out.println(c1);
        }
// generate first 5 odd number
        System.out.println("5 odd number");
        for (int i = 0; i < 5; i ++ ){
            System.out.println(2*i+1);
        }

        // Decrementing for loop
        System.out.println("numbers from 10 to 1");
for (int c1 = 10; c1 > 0; c1 --){
    System.out.println(c1);
}
        System.out.println("First 5 natural numbers in reverse order");
for (int d = 5; d > 0; d --){
    System.out.println(d);
}
    }
}
