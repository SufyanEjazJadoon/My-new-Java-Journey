package Revision;

public class ArraysCh6 {
    public static void main(String[] args) {
        // Arrays
        System.out.println("Array Types.");
        //1
        int[] marks = new int[3];
        marks[0] = 10;
        marks[1] = 20;
        marks[2] = 30;
        System.out.println(marks[2]);
        System.out.println();

        //2
        int[] mark = {11, 12, 13, 14, 15, 16};
        System.out.println(mark[2]);
        System.out.println();

        //3
        int[] markss;
        markss = new int[5];
        markss[0] = 11;
        markss[1] = 21;
        markss[2] = 31;
        markss[3] = 41;
        markss[4] = 51;
        System.out.println(markss[4]);
        System.out.println();

        //Array length
        System.out.println("Check the length of array:");
        System.out.println("Length of array " + markss.length);

        //Displaying of arrays.
        System.out.println("All arrays: ");
        //for loop
        for (int i = 0; i < markss.length; i++) {
            System.out.println(markss[i]);
        }
        //Reverse element.
        System.out.println("Reverse Array.");
        for (int i = markss.length - 1; i >= 0; i--) {
            System.out.println(markss[i]);
        }

        //For each loop
        System.out.println("use Element");
        for (int element : markss) {
            System.out.println(element);
        }
        System.out.println();
//Multi dimensional array
        System.out.println("Multi dimensional array");
        int[][] flats;
        flats = new int[2][3];
        flats[0][0] = 10;
        flats[0][1] = 20;
        flats[0][2] = 30;
        flats[1][0] = 11;
        flats[1][1] = 22;
        flats[1][2] = 33;
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
