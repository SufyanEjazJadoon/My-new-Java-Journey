package OOPs;

class Employe {
    int id;
    String name;

    public void printdetails() {
        System.out.println("My id is " + id);
        System.out.println("My name is " + name);
    }

}

public class CustomClass {
    public static void main(String[] args) {
        System.out.println("this is new class");

        Employe harry = new Employe();//Instantiating a new employe object
        Employe Ayyan = new Employe();
        //setting attributes
        Ayyan.id = 3;
        Ayyan.name = "ayyan";
        //Setting Attributes
        harry.id = 2;
        harry.name = "Sufyan";
        //printing attributes
        System.out.println(harry.id);
        System.out.println(harry.name);
        System.out.println(Ayyan.id);
        System.out.println(Ayyan.name);

        harry.printdetails();
        Ayyan.printdetails();
    }
}