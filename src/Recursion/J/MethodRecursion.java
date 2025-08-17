package Recursion.J;

public class MethodRecursion {

        //Recursion.
        //A function in Java call itself.
        //"Factorial" mean factorial of 5 is = 5x4x3x2x1 =120
        //factoral(n) = n * factorial (n-1)

    //Recursion method
    //is it to much easy to give a order one time for all functions
    static int factorial (int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            return n * factorial(n - 1);
        }

        //for loop
        //same work but this is lengthy and weird
    }static int factorial_iterative (int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {
            int product = 1;
            for (int i=1; i<=n; i++){
                product *= i;
            }
            return product;
        }
    }
        public static void main(String[] args) {
        int n = 5;
            System.out.println("The value of factorial n is: " + factorial( n) );
            System.out.println("The value of factorial n is: " + factorial_iterative( n) );


    }
}
