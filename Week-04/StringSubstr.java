// String substring, startsWith, endsWith Program

import java.util.*;

public class StringSubstr {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("String: ");

        String string = new String();
        string = scan.nextLine();

        System.out.print("Starts With String: ");
        String startsWithString = new String();
        startsWithString = scan.nextLine();
        if (string.startsWith(startsWithString))
            System.out.println(string + " Starts With " + startsWithString);
        else
            System.out.println(string + " Does Not Starts With " + startsWithString);

        System.out.print("Ends With String: ");
        String endsWithString = new String();
        endsWithString = scan.nextLine();
        if (string.endsWith(endsWithString))
            System.out.println(string + " Ends With " + endsWithString);
        else
            System.out.println(string + " Does Not Ends With " + endsWithString);

        System.out.print("Sub String: ");
        String subString = scan.nextLine();

        int n = string.length();
        int m = subString.length();
        int matchcount = 0;
        for (int i = 0; i < n - m + 1; i++) {
            if (string.substring(i, i + m).equals(subString))
                matchcount++;
        }
        System.out.println("Match Count: " + matchcount);

        scan.close();
    }
}