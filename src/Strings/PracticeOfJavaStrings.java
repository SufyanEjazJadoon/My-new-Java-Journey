package Strings;

public class PracticeOfJavaStrings {
    public static void main(String[] args) {
        //problem 1
        String name = "SUFYAN khan";
        System.out.println(name.toLowerCase());

        //Problem 2
        System.out.println(name.replace(' ','_'));

        //Problem 3
        String letter = "hey my name is <name>";
        //System.out.println(letter.replace("<name>","Labubu"));
    letter = letter.replace("<name>", "Balulu");
        System.out.println(letter);

        //problem 4
        String Mystring = "I am Super    man";
        System.out.println(Mystring.indexOf("      "));
        System.out.println(Mystring.indexOf("  "));

        //problem 5
        String Program = "Dear Labubu,\n\t this java program is nice.\n\t Thank you.";
        System.out.println(Program);


    }
}
