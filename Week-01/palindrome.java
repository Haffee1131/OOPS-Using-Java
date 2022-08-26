import java.util.*;

// PALINDROME PROGRAM

public class palindrome {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); // creating scanner object
        System.out.println("Enter your number: ");
        int num = scan.nextInt(); // input number

        int temp = num; // saving num in temporary variable
        int rem; // to save last digits
        int rev = 0; // to save reversing numbers

        // Reversing input number
        while (temp != 0) {
            rem = temp % 10; // taking out last digits
            rev = (rev * 10) + rem; // placing in rev variable
            temp = temp / 10; // removing last digit from given number
        }

        // checking if reverse number is equal to given number
        if (num == rev)
            System.out.format("%d is a palindrome\n", num);
        else // if reverse is not equal to given number
            System.out.format("%d is not a palindrome\n", num);
        scan.close();
    }
}