import java.util.Random;
import java.util.Scanner;

public class RockPaperGame {

    enum Move { ROCK, PAPER, SCISSORS }

    // Decide winner: returns 0 for tie, 1 if player wins, -1 if computer wins
    private static int decideWinner(Move player, Move computer) {
        if (player == computer) return 0;
        switch (player) {
            case ROCK:
                return (computer == Move.SCISSORS) ? 1 : -1;
            case PAPER:
                return (computer == Move.ROCK) ? 1 : -1;
            case SCISSORS:
                return (computer == Move.PAPER) ? 1 : -1;
        }
        return 0; // unreachable
    }

    private static Move randomMove(Random rnd) {
        Move[] moves = Move.values();
        return moves[rnd.nextInt(moves.length)];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rnd = new Random();

        int playerScore = 0;
        int computerScore = 0;
        int ties = 0;

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Type rock, paper, or scissors to play. Type 'exit' to quit.\n");

        while (true) {
            System.out.print("Your move: ");
            String input = scanner.nextLine().trim().toLowerCase();

            if (input.equals("exit")) {
                System.out.println("\nThanks for playing!");
                break;
            }

            Move playerMove = null;
            if (input.equals("rock")) playerMove = Move.ROCK;
            else if (input.equals("paper")) playerMove = Move.PAPER;
            else if (input.equals("scissors") || input.equals("scissor")) playerMove = Move.SCISSORS;

            if (playerMove == null) {
                System.out.println("Invalid input. Please type rock, paper, or scissors.\n");
                continue;
            }

            Move computerMove = randomMove(rnd);
            System.out.println("Computer chose: " + computerMove);

            int result = decideWinner(playerMove, computerMove);
            if (result == 0) {
                System.out.println("It's a tie!\n");
                ties++;
            } else if (result == 1) {
                System.out.println("You win this round!\n");
                playerScore++;
            } else {
                System.out.println("Computer wins this round!\n");
                computerScore++;
            }
            System.out.printf("Score -> You: %d | Computer: %d | Ties: %d%n%n",
                    playerScore, computerScore, ties);
        }
        System.out.printf("Final Score -> You: %d | Computer: %d | Ties: %d%n",
                playerScore, computerScore, ties);
        scanner.close();
    }
}
