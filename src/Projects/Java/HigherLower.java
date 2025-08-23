package Projects.Java;
import java.util.*;

public class HigherLower {
    public static void main(String[] args) {
        Random rand = new Random();
        int num1 = rand.nextInt(100) + 1;
        int num2 = rand.nextInt(100) + 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("First number: " + num1);
        System.out.print("Will the next number be Higher or Lower? ");
        String guess = sc.nextLine();

        System.out.println("Second number: " + num2);

        if ((num2 > num1 && guess.equalsIgnoreCase("Higher")) ||
                (num2 < num1 && guess.equalsIgnoreCase("Lower"))) {
            System.out.println("You Win!");
        } else {
            System.out.println("You Lose!");
        }
    }
}

