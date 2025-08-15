package Arrays;

public class Array {
    public static void main(String[] args) {
        //Array!
        //Sum of 5 students using array
        int [] marks = new int[5];
        marks[0] = 90;
        marks[1] = 80;
        marks[2] = 70;
        marks[3] = 60;
        marks[4] = 51;
        System.out.println(marks[2]);
        // there are two three types of array
        //third one is
        int[] marks1 = {12,33,44,55,66};
        System.out.println(marks1[4]);

        //Check the length of array.
        //System.out.println(marks1.length);

        //Displaying of array.
        //Applying for loop
        System.out.println("Printing using for loop");
        int[] marks2 = {12, 33, 44, 55, 66, 77};
        for (int i = 0; i < marks2.length; i++){
            System.out.println(marks2[i]);
        }
        //Quick Quiz
        //array in reverse order
        System.out.println("Array in reverse order");
        for (int i=marks2.length -1; i >=0; i--) {
            System.out.println(marks2[i]);
        }







    }
}
