package Revision;

public class QuestionsForCh5 {
    public static void main(String[] args) {

        //Print stars
        for (int a = 5; a > 1; a--) {
            for (int j = 1; j <= a; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // sum of first five even numbers
        int sum = 0;
        int i = 5;
        int n = 0;
        while (i >= n) {
            sum = sum + (2 * n);
            n++;
        }
        System.out.print("Sum of first 5 even numbers: ");
        System.out.println(sum);

        //Table of 4;
        int n1 = 4;
        for (int a1 = 1; a1 <=10; a1++){
            System.out.printf("%d x %d = %d\n", n1, a1, n1 * a1);
        }
        System.out.println( );
        //Table of 10. in reverse order
        System.out.println("Table of 10 in reverse order ");
        int c = 10;
        for (int d = 10; d>=1; d-- ){
            System.out.printf("%d x %d = %d\n",c, d, c*d);

        }


    }
}
