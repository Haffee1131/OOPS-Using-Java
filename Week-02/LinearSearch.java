// LINEAR SEARCH PROGRAM

import java.util.*;

public class LinearSearch{
    public static void main(String args[]){
        
        // creating scanner object
        Scanner scan = new Scanner(System.in);

        System.out.print("Number of Elements: ");
        int n = scan.nextInt();         // number of elements

        int[] searchList = new int[n];      // numbers list

        // Read Elements
        for(int i=0; i<n; i++){
            System.out.format("searchList[%d]: ", i);
            searchList[i] = scan.nextInt();
        }

        // Read key to search
        System.out.print("Key to search: ");
        int key = scan.nextInt();

        // Linear Search 
        int isFound = 0;       // isFound to check if element found
        for(int i=0; i<n; i++){
            if(searchList[i] == key){   // element found
                isFound = 1;
                System.out.format("Key: %d found at index: %d", key, i);
                break;
            }
        }
        if(isFound == 0)    // key not found
            System.out.format("Key:%d Not Found!", key);

        scan.close();
    }
}