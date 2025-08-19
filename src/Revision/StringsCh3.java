package Revision;

import java.util.Locale;

public class StringsCh3 {
    public static void main(String[] args) {
        // Strings
        //age kuch name likhna ho sentence likhna ho, length pta rni ho ya kuch b change krna ho sb string ki madad say hota hai

        //String methods.
        String name = "SUFYAN ejaz Jadoon";
        System.out.println(name);

        // agr name ki length pta krni ho
        System.out.println("Length of name is " + name.length());

        //sb letters ko lower letter may convert krnay k liya.
        System.out.println("in lower case " + name.toLowerCase());

        //sb leetter upper case may.
        System.out.println("in upper case " + name.toUpperCase());

        //space trim krnay k liya
        System.out.println("Extra space trim ho gyi hai " + name.trim());

        //pehlay k letters remove krnay k liya
        System.out.println(name.substring(4));

        //shuru ore akhir k letters remove krnay k liya.

        //ksi b word ko replace krnay k liya
        System.out.println(name.replace('J','G'));

        //age check krna ho k letter kis alphabet say start hua hai. true ya false
        System.out.println(name.startsWith(" SUFYAN"));

        // agr End check krna ho to. True or false
        System.out.println(name.endsWith("Jadoon"));

        //age dekhna ho k letter k is number pr kon sa alphabet hai.
        System.out.println(name.charAt(2));

        //letter k pichay kitnay letter bachay hai wo btata hai.
        System.out.println(name.indexOf("SUFYAN"));
        System.out.println(name.indexOf("ejaz", 3));

        //cheak kro k ya word hai ya nhi hai
        System.out.println(name.equals("SUFYAN ejaz Jadoon"));

        //agr case ko ignore kr k cheak krna ho to
        System.out.println(name.equalsIgnoreCase("sufyan ejaz jadoon"));
    }
}
