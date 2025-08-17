package MethodsForJAVA;

public class MethodsJava {
    /*Methods" of java.
    Method ek chhota function hota hai jo code ka ek specific kaam karta hai.
    Static method.
     we use this method to not write a function again and again.*/
    static int logic(int x, int y){
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
return z;
    }
    public static void main(String[] args) {

        int a = 20;
        int b = 30;
        int c = logic(a, b);


        System.out.println(" ");
        int a1 = 30;
        int b1 = 20;
        int c1 = logic(a1, b1);
        System.out.println(c);
        System.out.println(c1);

/*Calling method.
is ka mtlb hota hai k ham method ko kis name say bulayengay ore new code k saath use kray-
 gay jesay add, logic etc
 */





   }
           }