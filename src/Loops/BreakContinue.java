package Loops;

public class BreakContinue {
    public static void main(String[] args) {
        //Break and continue
        // Break statement is use to Exit the loop
        //For loop
      for  (int a=1; a<5; a++) {
          System.out.println(a);
          System.out.println("The Great");
          if (a == 2) {
              System.out.println("Ending of Loop");
              break;
          }
      }
//while loop
          int b=1;
          while (b<5) {
              System.out.println(b);
              System.out.println("Java is best");
              if (b == 2) {
                  System.out.println("Who is king");
                  break;
              }
              b++;
          }

    }
}
