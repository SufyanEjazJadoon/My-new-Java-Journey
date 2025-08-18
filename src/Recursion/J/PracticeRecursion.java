package Recursion.J;

public class PracticeRecursion {
    static int fibonachi(int n) {
        if (n <= 1)
            return n;
        return fibonachi(n - 1) + fibonachi(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci series");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonachi(i) + " ");
        }
        System.out.println(" ");
        //Star Triangle
        int a = 4;
        for (int b = 1; b <= a; b++) {
            for (int c = 1; c <= b; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
