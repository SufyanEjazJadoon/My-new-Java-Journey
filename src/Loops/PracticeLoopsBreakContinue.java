package Loops;

public class PracticeLoopsBreakContinue {
    public static void main(String[] args) {

        //Problem 1

                int a = 4; // total stars wali line ki length (n)

                for (int b = a; b > 0; b--) { // outer loop: line ka number
                    for (int c = 0; c < b; c++) { // inner loop: stars print karna
                        System.out.print("*");
                    }
                    System.out.println(); // next line par jana
                }
// Problem 2
int sum = 0;
                int i = 5;
                int n = 0;
                while (i>n){
                    sum = sum + (2*n);
                    n++;
                }
        System.out.println("sum of first 5 Even number");
        System.out.println(sum);

        //Problem 3


    }

}