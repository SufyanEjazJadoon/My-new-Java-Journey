package Strings;

public class Stringsmethods {
    public static void main(String[] args) {
        String name = "Labubu";

        //cheak the length by using strings
        int value = name.length();
        System.out.println("Lenght of name " + value);
        System.out.println(name);

        // convert all capital letters into lower
String lstring = name.toLowerCase();
        System.out.println(lstring);

        // now we convert all lowercase to uppar case mean in capital by using string
        String ustring = name.toUpperCase();
        System.out.println(ustring);

        //we use Trimmed string. this string remove extra spaces.
        String trimmed = name.trim();
        System.out.println(trimmed);

//we use Nontrimmed string. this string never remove extra spaces.
        String nonTrimmedString = ("           Hello dear            ");
        System.out.println(nonTrimmedString);

        // we use substring. that subtract the number of word that we write in box
        System.out.println(name.substring(3));
        System.out.println(name.substring(1,2));

        // replace string is use to replace a words into new given word
        System.out.println(name.replace('b','l'));
        System.out.println(name.replace("bubu","gugu"));

        //startsWith string is use to cheak which letter is on start
        System.out.println(name.startsWith("La"));

        //endsWith string is use to cheak in which words this ends
        System.out.println(name.endsWith("bubu"));

        //charAt string is use to cheak at that letter which character is
        System.out.println(name.charAt(0));

        //indexOf string is use to check in which number the character is!
        System.out.println(name.indexOf("bu"));

        //equals string is use to check the values are same or not by entered valu
        System.out.println(name.equals("Labubu"));
        System.out.println(name.equals("labubu"));

        //equalIgnoreCase is use to cheak the values but not by his case and ignoring capital or small letters
        System.out.println(name.equalsIgnoreCase("labUBU"));

        //escape sequece are the different symbols use for different specific work

        System.out.println("i am labubu");



    }
}
