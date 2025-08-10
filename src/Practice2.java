import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        //float a = 7 / 4.0f * 9 / 2.0f;
      //  System.out.println(a);

        char grade = 'B';
        grade = (char) (grade + 8);
        System.out.println(grade);

        // decrypt the grade
        grade = (char) (grade - 8);
        System.out.println(grade);

        // new qution cheak number is grather than enterd num or not

        Scanner sc = new Scanner(System.in);
                int A = sc.nextInt();
        System.out.println(A>8);

        // new question
        System.out.println(7*49/7 + 35/7);

        // next new question

        float v=40;
        float u=4;
        float a=6;
        float s=8;
        float formula=   (v*v - u*u) /(2*a*s);
        System.out.println(formula);



    }
}
