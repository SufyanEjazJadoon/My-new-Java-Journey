package Loops;

public class PracticeLoopsBreakContinue {
    public static void main(String[] args) {

        //Problem 1
        System.out.println("Stars in a row ");
        int a = 4; // total stars wali line ki length (n)

        for (int b = a; b > 0; b--) { // outer loop: line ka number
            for (int c = 0; c < b; c++) { // inner loop: stars print karna
                System.out.print("*");
            }
            System.out.println(); // next line par jana
        }
// Problem 2
        System.out.println("");
        int sum = 0;
        int i = 5;
        int n = 0;
        while (i > n) {
            sum = sum + (2 * n);
            n++;
        }
        System.out.println("sum of first 5 Even number");
        System.out.println(sum);

        //Problem 3 // make a "5 table"
        System.out.println("");
        System.out.println("Table of 5");
        int n1 = 5;
        for (int i1 = 1; i1 <= 10; i1++) {
            System.out.printf("%d X %d = %d\n", n1, i1, n1 * i1);
        }

        // problem 4
        System.out.println("");
        System.out.println("Table of 10 in reverse order");
        int n2 = 10;
        for (int i2 = 10; i2 >= 1; i2--) {
            System.out.printf("%d X %d = %d\n", n2, i2, n2 * i2);
        }
        //Problem 5
        // Factorial of 5
        System.out.println("");
        System.out.println("'Factorial of 5'");

        int n3 = 5;
        int i3 = 1;
        int factorial = 1;
        while (i3 <= n3) {
            factorial *= i3;
            i3++;
        }
        System.out.println(factorial);

        // Problem 6
        System.out.println("");
        System.out.println("Sum of First 10 Multiples of 8");
        int sum1 = 0;
        int n4 = 8;
        for (int i2 = 1; i2 <= 10; i2++) {
            sum1 += n4*i2;
        }
        System.out.println(sum1);

    }

}