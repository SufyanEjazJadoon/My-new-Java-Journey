package Revision;

public class QuestionsForCh3 {
    public static void main(String[] args) {
        String school = "Shaheen Public School";
        //Write a java program to convert string to Lowercase
        System.out.println(school.toLowerCase());

        //replace spaces with underscore
        System.out.println(school.replace(' ','_'));

        //write a sentence and add "" and space through escape sequence in string
        System.out.println("\"Dear Ayyan\tThanks alot\"");

        //detect double or single spaces
        System.out.println(school.contains(" "));
        if (school.contains(" ")){
            System.out.println("they have 1 spaces");
        }else {
            System.out.println("They have not any spaces");
        }

    }
}
