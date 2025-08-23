package Projects.Java;

import java.util.*;

public class MathQuizGame {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int a = rand.nextInt(10) + 1;
        int b = rand.nextInt(10) + 1;
        int correct = a + b;

        System.out.print("What is " + a + " + " + b + " ? ");
        int answer = sc.nextInt();

        if (answer == correct) {
            System.out.println("Correct!");
        } else {
            System.out.println("Wrong! Answer was " + correct);
        }
    }
}

