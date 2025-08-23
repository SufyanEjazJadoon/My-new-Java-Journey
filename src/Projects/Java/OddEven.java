package Projects.Java;

import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Choose Odd or Even: ");
        String choice = sc.nextLine();

        int num = rand.nextInt(100) + 1;
        System.out.println("Number is: " + num);

        if ((num % 2 == 0 && choice.equalsIgnoreCase("Even")) ||
                (num % 2 != 0 && choice.equalsIgnoreCase("Odd"))) {
            System.out.println("You Win!");
        } else {
            System.out.println("You Lose!");
        }
    }
}
