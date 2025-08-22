package Revision;

public class MethodsCh7 {
    static int logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 2;
        }
        return z;
    }

    public static void main(String[] args) {
        //Methods
        int a = 10;
        int b = 20;
        int c = logic(a, b);
        System.out.println(c);
        System.out.println();
    int a1 = 20;
    int b1 = 10;
    int c1 = logic(a1,b1);
        System.out.println(c1);

    }
}
