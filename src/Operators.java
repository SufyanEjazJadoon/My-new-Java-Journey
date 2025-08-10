public class Operators {
    public static void main(String[] args) {
        //arthimatic operators
        int a = 5;
        int b = 10;
        b *= 2;
        System.out.println(b);

        System.out.println(10>11); // comparison operators

        //bitwise operators
        System.out.println(10>9 && 10> 7);

//precednece and Associativity

        int a1 = 60/5-34*2;

        System.out.println(a1);

        int x = 20;
        int y = 5;
        int z = 2;
        //int k = x*y/5;
        int k = y*y - (4*x*y)/(2*x);
        System.out.println(k);
        // Increment and decremnet
        int A = 20;
        System.out.println(A++);
        System.out.println(A);
        System.out.println(++A);
        System.out.println(A);
        //Quiz
        int B = 7;
        int C = ++B * 8;
        System.out.println(C);



    }
}
