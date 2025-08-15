package Arrays;

public class PractiseOfArray {
    public static void main(String[] args) {
        //Problem 1
        float[] marks = {12.2f, 13.2f, 14.3f, 15.4f, 16.5f, 17.6f};
        float sum = 0;
        for (float element : marks) {
            sum = sum + element;
        }
        System.out.println("The value of sum is " + sum);

        //Problem 2
        //
        float[] markss = {12.2f, 13.2f, 14.3f, 15.4f, 16.5f, 17.6f};
        float num = 13.2f;
        boolean isInArray = false;
        for (float elements : markss) {
            if (num == elements) {
                isInArray = true;
                break;
            }
        }
        if (isInArray)
            System.out.println("This value is present in the array");
        else {
            System.out.println("This value is not present in th array");
        }

        //Problem 3
        float[] marks1 = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum1 = 0;
        for (float elementss : marks1) {
            sum1 = sum1 + elementss;
        }
        System.out.println("The Value of average marks is" + sum1 / marks1.length);
        System.out.println(" ");

        //problem 4
        //2X3 matrix 2D
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
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(result[i][j] + "");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");
        }
        // problem 5
        //Reverse an array
        System.out.println("");
        System.out.println("Reverse a array");
        int[] marks2 = {12, 13, 14, 15, 16, 17};
        for (int i1 = marks2.length - 1; i1 > 0; i1--) {
            System.out.println(marks2[i1]);
        }


        //
        System.out.println("new reverse");
        int[] arr = {1, 2, 3, 4, 5, 6};
        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;
        for (int i=0; i<n; i++) {
            //swap a[i] & a[l-1-i]
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;

        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
