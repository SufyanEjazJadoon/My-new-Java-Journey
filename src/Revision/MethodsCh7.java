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
    //Method Overloading
    static void change(int [] arr){
        arr [0] = 25;
    }

    static void joke (){
        System.out.println("Manay aik online store say book mangwayi thi how to scam Online,\n" +
                " ab 2 mahinay guzr gay hain book nhi ayi");
    }
    //method overloading foo
    static void foo(){
        System.out.println("I Am Sufyan");
    }
    static void foo(int a) {
        System.out.println("I Am Sufyan" + a);
    }

    //Var args
static int sum(int ...arr){
        int result = 0;
        for (int a : arr){
            result += a;
    }
     return result;
}
//
    static void foo(int a, int b){
        System.out.println("Harry son " + a + " years ");
        System.out.println("Harry sister " + b + " years ");
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

        //Method Overloading
        System.out.println("Method Overloading");
        int [] marks = new int[4] ;
        marks [0] = 10;
        marks [1] = 10;
        marks [2] = 10;
        marks [3] = 10;
        change(marks);
        System.out.println("Marks changed by Method Overloading " + marks[0]);
        foo();
        foo(12);
        foo(11,22);
      joke();

      //Varargs
        System.out.println("The sum of 10,20,30 is = "+sum(10,20,30));
    }
}
