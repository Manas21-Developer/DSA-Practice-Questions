package Sorting;

import java.util.Scanner;
import java.util.Arrays;

public class IndexOfTheTargetEementAfterSorting {
    static int findIndex(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int s = 0;
        int e = n-1;
        while (s<=e)
        {
            int mid = s+(e-s)/2;
            if (arr[mid] == k)
            {
                return mid;
            }else if(arr[mid] > k) e = mid-1;
            else s = mid+1;
        }return -1;
    }
    // Main function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Input size of array
        int[] arr = new int[n]; // Declare array of size n

        // Input elements into the array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int k = scanner.nextInt(); // Input value of k

        // Call the function findIndex and store the result in index
        int index = findIndex(arr, n, k);

        // Output the result
        System.out.println(index);

        scanner.close(); // Close the scanner
    }
}

