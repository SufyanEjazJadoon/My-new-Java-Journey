package Loops;

public class BreakContinue {
    public static void main(String[] args) {
        //Break and continue
        // Break statement is use to Exit the loop
        //For loop
        for (int a = 1; a < 5; a++) {
            System.out.println(a);
            System.out.println("The Great");
            if (a == 2) {
                System.out.println("Ending of Loop");
                break;
            }
        }
//while loop
        int b = 1;
        while (b < 5) {
            System.out.println(b);
            System.out.println("Java is best");
            if (b == 2) {
                System.out.println("Who is king");
                break;
            }
            b++;
        }
        //Continue
        // it is use to move next line
        for (int c = 0; c <= 10; c++) {
            if (c == 2) {
                System.out.println("One and only");
                continue;
            }
            System.out.println(c);
            System.out.println("who is abra");
        }

        //Do while loop
        int d = 0;
        do {
            d++;
            if (d == 2) {
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(d);
            System.out.println("The Do while loop");
        }
        while (d<5);
            System.out.println("Loop End Here");





    }
}
