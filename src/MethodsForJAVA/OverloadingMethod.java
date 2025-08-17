package MethodsForJAVA;

public class OverloadingMethod {
    //for changing in array!
    //Reference change but object is not change!
    //but in some problems object is changes
    static void change(int [] arr){
        arr [0] = 25;
    }
    static void telljoke() {
        System.out.println("I made a new word \n" +
                "Plagarism");
    }
    //Method Overloading foo
    static void foo(){
        System.out.println( " I am harry porter");
    }

    static void foo(int a){
        System.out.println("Harry porter " + a);
    }

    static void foo(int a, int b){
        System.out.println("Harry son " + a + " years ");
        System.out.println("Harry sister " + b + " years ");
    }

    public static void main(String[] args){
        telljoke();

        //int Array;
        int [] marks = new int[3];
        marks [0] = 10;
        marks [1] = 20;
        marks [2] = 30;
        change(marks);
        System.out.println("The value of x after running change is: "+marks[0]);
        System.out.println(" ");
        //method Overloading
        //two ore more same name but different parameter.
        System.out.println("Method Overloading");
foo();
foo(22);
foo( 24, 44);
//Arguments are actual.
    }
}
