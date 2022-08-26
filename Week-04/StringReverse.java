// String Reverse Program

import java.util.*;

public class StringReverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("String: ");

        String string = new String();
        string = scan.nextLine();

        int stringLength = string.length();

        String reverseString = "";
        for (int i = stringLength - 1; i >= 0; i--) {
            reverseString += string.charAt(i);
        }

        System.out.println("Reversed String: " + reverseString);

        scan.close();
    }
}