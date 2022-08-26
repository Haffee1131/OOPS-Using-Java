// BINARY SEARCH PROGRAM

import java.util.*;

public class BinarySearch{
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

        // Bubble Sort 
        for(int i=1; i<n; i++){
            for(int j=0; j<n-i; j++){
                if(searchList[j] > searchList[j+1]){
                    int temp = searchList[j];
                    searchList[j] = searchList[j+1];
                    searchList[j+1] = temp;
                }
            }
        }

        // printing Sorted Search List
        System.out.print("Sorted SearchList: ");
        for(int i=0; i<n; i++){
            System.out.format("%d ",searchList[i]);
        }
        System.out.println();


        // Binary Search

        // low, mid and high are indexes
        int low = 0, high = n-1, mid, isFound = 0;

        while(low <= high){
            mid = (low + high)/2;   // finding mid value

            if(searchList[mid] == key){     // key found
                isFound = 1;
                System.out.format("key:%d found at index:%d", key, mid);
                break;
            }
            else if(searchList[mid] < key)      // if key is greater than mid value
                low = mid + 1;  // go to right

            else                 // if key is less than mid value
                high = mid - 1;     // go to left
        }

        if(isFound == 0)    // key not found
            System.out.format("key: %d not found", key);

        scan.close();
    }
}