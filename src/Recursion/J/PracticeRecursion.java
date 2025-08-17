package Recursion.J;

public class PracticeRecursion {
    static int fibonachi(int n){
        if (n <= 1)
            return n;
        return fibonachi(n - 1) + fibonachi(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci series");
        for (int i = 0; i < n; i++){
            System.out.print(fibonachi(i)+ " ");
        }
    }
}
