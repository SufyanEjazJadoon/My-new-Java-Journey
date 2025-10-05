package OOPs;
class Employe1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}


public class PracticequestionsOOP {
    public static void main(String[] args) {

        //Problem 1
        Employe1 sufyan = new Employe1();
        sufyan.setName("Sufyan khan");
        sufyan.salary = 250;
        System.out.println(sufyan.getName());
        System.out.println(sufyan.getSalary());


    }
}
