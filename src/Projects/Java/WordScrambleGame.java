package Projects.Java;

import java.util.*;

public class WordScrambleGame {
    public static void main(String[] args) {
        String word = "JAVA";
        List<Character> letters = new ArrayList<>();
        for (char c : word.toCharArray()) letters.add(c);
        Collections.shuffle(letters);

        System.out.print("Unscramble this word: ");
        for (char c : letters) System.out.print(c);

        Scanner sc = new Scanner(System.in);
        System.out.print("\nYour guess: ");
        String guess = sc.nextLine();

        if (guess.equalsIgnoreCase(word)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! The word was: " + word);
        }
    }
}

