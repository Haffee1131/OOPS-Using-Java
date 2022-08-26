// String concat Program

import java.util.*;

public class StringConcat {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("String1: ");

        String string1 = new String();
        string1 = scan.nextLine();

        System.out.print("String2: ");

        String string2 = new String();
        string2 = scan.nextLine();

        System.out.println("\nUsing concat");
        System.out.println(string1.concat(string2));

        System.out.println("\nUsing +");
        System.out.println(string1 + string2);

        scan.close();
    }
}
