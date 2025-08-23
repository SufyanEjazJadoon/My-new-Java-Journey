package Projects.Java;
import java.util.*;

public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1;
        int guess;

        System.out.println("Guess the number between 1 and 100:");

        do {
            guess = sc.nextInt();
            if (guess < number) {
                System.out.println("Too Low!");
            } else if (guess > number) {
                System.out.println("Too High!");
            } else {
                System.out.println("Correct! You guessed it.");
            }
        } while (guess != number);
    }
}
