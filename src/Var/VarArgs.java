package Var;

public class VarArgs {
    static int sum(int ...arr) {
        int result=0;
        for (int a: arr){
            result +=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 5,4,3 is = " + sum(5,4,3));
        System.out.println(("The sum of 12,45 is = "+ sum(12, 45)));
        //Var ags is use to write only one time method for all reasons.

    }
}
