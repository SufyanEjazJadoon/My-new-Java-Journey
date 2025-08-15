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

    //Problem 3
        float [] marks1 = { 45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum1 = 0;
        for (float elementss:marks1){
            sum1 = sum1 + elementss;
        }
        System.out.println("The Value of average marks is" + sum1/marks1.length);

    }

}
