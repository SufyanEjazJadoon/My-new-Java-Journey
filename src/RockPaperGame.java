import java.util.Random;
import java.util.Scanner;

public class RockPaperGame {
    enum Move {Rock, Paper, Scissors}

    public static int decideWinner(Move player, Move computer) {
        if (player == computer) return 0;
        switch (player) {
            case Rock:
                return (computer == Move.Scissors) ? 1 : -1;
            case Paper:
                return (computer == Move.Rock) ? 1 : -1;
            case Scissors:
                return (computer == Move.Paper) ? 1 : -1;
            return 0;
            private static Move randomMove (Random rnd) {
                Move[] moves = Move.values();
                return moves[rnd.nextint(moves.length)];
                public static void main (String[] args){
                    Scanner scanner = new scanner(System.in);
                    Random rnd = new Random();



                }
            }
        }
    }
}
