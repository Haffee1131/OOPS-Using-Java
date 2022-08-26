import java.util.*;

// LARGEST AND SMALLEST PROGRAM

public class largestAndSmallest {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); // creating scanner object

        System.out.println("Enter number of values: ");
        int n = scan.nextInt(); // number of values
        int a[] = new int[n]; // declaring array with size n
        int smallest = 9999; // smallest number
        int largest = -1; // largest number

        for (int i = 0; i < n; i++) {
            System.out.format("Enter value of a[%d]: ", i);
            a[i] = scan.nextInt();

            // finding smallest
            if (a[i] < smallest)
                smallest = a[i];

            // finding largest
            if (a[i] > largest)
                largest = a[i];
        }
        System.out.format("Smallest value: %d\n", smallest);
        System.out.format("Largest value: %d\n", largest);

        scan.close();
    }
}