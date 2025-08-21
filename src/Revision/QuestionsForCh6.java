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
        System.out.println();

    //find given Integer is Present or not.
        float[] markss = {12.2f, 13.2f, 14.3f, 15.4f, 16.5f, 17.6f};
        float num = 13.2f;
        boolean isInArray = false;

        for (float elements : markss) {
            if (Math.abs(num - elements) < 0.0001f) {  // tolerance check
                isInArray = true;
                break;
            }
        }

        if (isInArray) {
            System.out.println(num + " is in the array");
        } else {
            System.out.println(num + " is NOT in the array");
        }
    }
}
