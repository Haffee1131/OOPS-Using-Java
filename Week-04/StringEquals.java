// String equals and equalsIgnoreCase Program

import java.util.*;

public class StringEquals {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("String1: ");

        String string1 = new String();
        string1 = scan.nextLine();

        System.out.print("String2: ");

        String string2 = new String();
        string2 = scan.nextLine();

        System.out.println("Using equals");
        if(string1.equals(string2))
            System.out.println("Strings are Equal");
        else
            System.out.println("Strings are Not Equal");

        System.out.println("\nUsing equalsIgnoreCase");
        if(string1.equalsIgnoreCase(string2))
            System.out.println("Strings are Equal");
        else
            System.out.println("Strings are Not Equal");

        scan.close();
    }
}
