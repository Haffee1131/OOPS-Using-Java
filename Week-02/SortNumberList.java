// SORTING NUMBERS LIST PROGRAM

import java.util.*;

public class SortNumberList {
    public static void main(String args[]) {

        // creating scanner object
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of values: ");
        int n = scan.nextInt(); // number of values

        int[] numberList = new int[n]; // declaring numberList with size n

        // Scanning numberList values
        for (int i = 0; i < n; i++) {
            System.out.format("Number List[%d]: ", i);
            numberList[i] = scan.nextInt();
        }

        // Bubble Sort
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (numberList[j] > numberList[j + 1]) {
                    int temp = numberList[j];
                    numberList[j] = numberList[j + 1];
                    numberList[j + 1] = temp;
                }
            }
        }

        // printing sorted Number List
        System.out.print("Sorted Number List: ");
        for (int i = 0; i < n; i++) {
            System.out.format("%d ", numberList[i]);
        }

        scan.close();
    }
}