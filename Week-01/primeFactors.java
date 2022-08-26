import java.util.*;

// FINDING PRIME FACTORS PROGRAM

public class primeFactors {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); // creating scanner object
        System.out.println("Enter your number: ");
        int num = scan.nextInt(); // input number

        int isPrime;// flag to check if number is a prime

        // loop from 2 to the num (not from 1 because, 1 is not prime nor composite)
        for (int i = 2; i <= num; i++) {
            if (num % i == 0) {
                int factor = i; // i is a factor
                // check if factor is prime
                isPrime = 1;

                for (int j = 2; j < (factor / 2); j++) { // optimised code
                    if (factor % j == 0) { // if other than 1 and itself is a factor then it is not a prime
                        isPrime = 0;
                        // break;
                    }
                }
                if (isPrime == 1) { // check if num is prime
                    System.out.format("%d is prime factor of %d\n", factor, num);

                }
            }
        }
        scan.close();
    }
}