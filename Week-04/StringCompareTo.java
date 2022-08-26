// String compareTo and compareIgnoreCase Program

import java.util.*;

public class StringCompareTo {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("String1: ");

        String string1 = new String();
        string1 = scan.nextLine();

        System.out.print("String2: ");

        String string2 = new String();
        string2 = scan.nextLine();

        System.out.println("Using compareTo");
        if(string1.compareTo(string2) == 0)
            System.out.println("Strings are Equal");
        else
            System.out.println("Strings are Not Equal");

        System.out.println("\nUsing compareToIgnoreCase");
        if(string1.compareToIgnoreCase(string2) == 0)
            System.out.println("Strings are Equal");
        else
            System.out.println("Strings are Not Equal");

        scan.close();
    }
}
