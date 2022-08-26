import java.util.*;

// SORTING STRINGS PROGRAM

public class StringsSort {
    static int compare(String s1, String s2) {
        if (s1.length() > s2.length())
            return 1;
        else if (s1.length() < s2.length())
            return -1;
        else { // if length is same , go for character by character check
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) > s2.charAt(i))
                    return 1;
                else if (s1.charAt(i) < s2.charAt(i))
                    return -1;
            }
            return 0;
        }
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); // creating scanner object

        System.out.println("Enter number of strings: ");
        int n = scan.nextInt(); // number of strings
        String[] stringList = new String[n]; // declaring string list with size n

        // Scanning string list values
        for (int i = 0; i < n; i++) {
            System.out.format("Enter value of stringList[%d]: ", i);
            stringList[i] = scan.next();
        }

        // sorting string list
        int i, j;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (compare(stringList[j], stringList[j + 1]) == 1) {
                    String temp = stringList[j];
                    stringList[j] = stringList[j + 1];
                    stringList[j + 1] = temp;
                }
            }
        }
        // printing string list
        for (i = 0; i < n; i++) {
            System.out.println(stringList[i]);
        }
    }
}
