package Projects.Java;
import java.util.*;

public class CoinTossGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Choose Heads or Tails: ");
        String choice = sc.nextLine();

        String result = rand.nextBoolean() ? "Heads" : "Tails";
        System.out.println("Coin landed on: " + result);

        if (choice.equalsIgnoreCase(result)) {
            System.out.println("You Win!");
        } else {
            System.out.println("You Lose!");
        }
    }
}

