package Revision;

public class LoopsCh5 {
    public static void main(String[] args) {
        //Loops
        //Three types of loops
        //While loop
        System.out.println("Ascending order");
        int a = 1;
        while (a <= 10){
            System.out.println(a);
            a++;
        }
        System.out.println(" ");
        System.out.println("Descending order");
        int b = 20;
        while (b>=1){
            System.out.println(b);
            b--;
        }
        //do while loop

        System.out.println(" ");
        System.out.println("do whileAscending order");
        int c = 1;
        do {
            System.out.println(c);
            c++;
        }while (c<=10);

        System.out.println(" ");
        int d = 5;
        do {
            System.out.println(d);
            d++;
        }while (d <=15);

        System.out.println("Do while descending order");
        int e = 10;
        do {
            System.out.println(e);
        e--;
        }while (e >=1);
    }
}
