package Revision;

public class QuestionsForCh6 {
    public static void main(String[] args) {
//Array of 5 floats and their sum
        int[] marks = new int[5];
        marks[0] = 2;
        marks[1] = 3;
        marks[2] = 4;
        marks[3] = 5;
        marks[4] = 6;
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
                        sum = sum + marks[i];
        }
        System.out.println("Sum of arrays" + sum );
    }
}
