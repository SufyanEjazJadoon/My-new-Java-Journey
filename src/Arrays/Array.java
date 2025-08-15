package Arrays;

public class Array {
    public static void main(String[] args) {
        //Array!
        //Sum of 5 students using array
        int [] markss = new int[5];
        markss[0] = 90;
        markss[1] = 80;
        markss[2] = 70;
        markss[3] = 60;
        markss[4] = 51;
        System.out.println(markss[2]);
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

        //Displaying array using for each loop
        System.out.println("Printing using for-each loop");
        for (int element: marks2){
            System.out.println(element);
        }
    }
}
