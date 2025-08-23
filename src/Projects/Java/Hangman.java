package Projects.Java;

import java.util.*;

public class Hangman {
    public static void main(String[] args) {
        String word = "COMPUTER";
        char[] hidden = new char[word.length()];
        Arrays.fill(hidden, '_');
        Scanner sc = new Scanner(System.in);

        int tries = 5;
        while (tries > 0) {
            System.out.println("Word: " + String.valueOf(hidden));
            System.out.print("Guess a letter: ");
            char ch = sc.next().charAt(0);

            boolean correct = false;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == Character.toUpperCase(ch)) {
                    hidden[i] = word.charAt(i);
                    correct = true;
                }
            }

            if (!correct) tries--;

            if (String.valueOf(hidden).equals(word)) {
                System.out.println("You Win! Word: " + word);
                return;
            }
        }
        System.out.println("Game Over! Word was: " + word);
    }
}
