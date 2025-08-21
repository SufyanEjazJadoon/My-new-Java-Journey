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
        System.out.println("Sum of arrays" + sum);
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
        // 2x3 matrix
        System.out.println(" ");
        int[][] mat1 = {{1, 2, 3},
                {4, 5, 6}};
        int[][] mat2 = {{6, 5, 4},
                {5, 3, 7}};
        int[][] result = {{0, 0, 0},
                {0, 0, 0}};
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.format("setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
                System.out.println(" ");
            }
        }
        System.out.println();
//Reverse an array
        int[] marks1 = {10, 11, 12, 13, 14, 15};
        for (int i1 = marks1.length - 1; i1 >= 0; i1--) {
            System.out.println(marks1[i1]);
        }
        System.out.println( );
    //Find maximum value
        int [] arr1 = {20,40,60,80,100};
        int max = 0;
        for (int e: arr1) {
            if (e > max) {
                max = e;
            }
        }
        System.out.println("The maximum element is " + max);

    }
}
