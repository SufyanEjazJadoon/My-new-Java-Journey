package Projects.Java;

import java.util.*;

public class TicTacToe {
    static char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public static void printBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) System.out.println("---|---|---");
        }
    }

    public static boolean checkWin(char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
                (board[0][2] == player && board[1][1] == player && board[2][0] == player);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char player = 'X';
        for (int turn = 0; turn < 9; turn++) {
            printBoard();
            System.out.print("Player " + player + " enter row and col (0-2): ");
            int r = sc.nextInt();
            int c = sc.nextInt();
            if (board[r][c] == ' ') {
                board[r][c] = player;
                if (checkWin(player)) {
                    printBoard();
                    System.out.println("Player " + player + " Wins!");
                    return;
                }
                player = (player == 'X') ? 'O' : 'X';
            } else {
                System.out.println("Invalid move, try again.");
                turn--;
            }
        }
        printBoard();
        System.out.println("It's a Draw!");
    }
}

