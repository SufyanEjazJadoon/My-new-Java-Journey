package Arrays;

public class PractiseOfArray {
    public static void main(String[] args) {
        //Problem 1
float [] marks = { 12.2f, 13.2f, 14.3f, 15.4f, 16.5f,17.6f};
            float sum = 0;
            for (float element:marks){
sum = sum + element;
            }
        System.out.println("The value of sum is " + sum);

            //Problem 2
        //
        float [] markss = { 12.2f, 13.2f, 14.3f, 15.4f, 16.5f,17.6f};
        float num = 13.2f;
        boolean isInArray = false;
        for (float elements:markss){
            if (num ==elements){
isInArray = true;
            break;}
        }
        if (isInArray)
            System.out.println("This value is present in the array");
    else {
            System.out.println("This value is not present in th array");
        }
    }

}
