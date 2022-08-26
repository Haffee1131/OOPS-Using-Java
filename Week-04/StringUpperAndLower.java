// String toUpperCase and toLowerCase Program

import java.util.*;

public class StringUpperAndLower {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("String: ");
        String string = new String();
        string = scan.nextLine();

        string = string.toUpperCase();
        System.out.println("Upper case String: " + string);

        string = string.toLowerCase();
        System.out.println("Lower case String: " + string);

        scan.close();
    }
}