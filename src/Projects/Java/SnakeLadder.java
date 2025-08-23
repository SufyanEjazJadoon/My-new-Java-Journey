package Projects.Java;

import java.util.*;

public class SnakeLadder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int playerPos = 0;
        int winningPos = 20;  // chhota board rakha hai easy banane k liye
        Map<Integer, Integer> snakes = new HashMap<>();
        Map<Integer, Integer> ladders = new HashMap<>();

        // Snake bites
        snakes.put(17, 4);
        snakes.put(19, 7);

        // Ladders
        ladders.put(3, 11);
        ladders.put(6, 14);

        System.out.println("🎲 Snake & Ladder Game 🎲");
        System.out.println("Reach position " + winningPos + " to win!");
        System.out.println("Snakes: " + snakes);
        System.out.println("Ladders: " + ladders);

        while (playerPos < winningPos) {
            System.out.print("\nPress ENTER to roll dice...");
            sc.nextLine();

            int dice = rand.nextInt(6) + 1;
            System.out.println("You rolled: " + dice);

            playerPos += dice;

            if (snakes.containsKey(playerPos)) {
                System.out.println("🐍 Oh no! Snake bite at " + playerPos);
                playerPos = snakes.get(playerPos);
            } else if (ladders.containsKey(playerPos)) {
                System.out.println("🪜 Yay! Ladder climb at " + playerPos);
                playerPos = ladders.get(playerPos);
            }

            if (playerPos > winningPos) playerPos = winningPos; // stop overflow
            System.out.println("You are now at position: " + playerPos);
        }

        System.out.println("\n🎉 Congratulations! You won the game! 🎉");
    }
}

