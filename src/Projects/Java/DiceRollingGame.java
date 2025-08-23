package Projects.Java;

import java.util.*;

public class DiceRollingGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int dice = rand.nextInt(6) + 1;
        System.out.println("You rolled a " + dice);
    }
}
