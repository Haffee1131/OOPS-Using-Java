// String Length Program

import java.util.*;

public class StringLength {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("String: ");

        String string = new String();
        string = scan.nextLine();

        System.out.println("Length of " + string + ": " + string.length());
        scan.close();
    }
}