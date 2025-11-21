package MergeAndQuickSort;

import java.util.*;
import java.io.*;

public class QuickSort {
    public class Solution {
        static void quickSort(int[] arr) {
            helper(arr,0, arr.length-1);
        }
        static void helper (int [] arr ,int s , int e)
        {
            if(s>=e) return ;

            int low = s;
            int high = e;

            int mid = s +(e-s)/2;

            int pivot = arr[mid];

            while (low <= high)
            {
                while (arr[low] < pivot) low++;
                while (arr[high] > pivot) high--;

                if(low <= high)
                {
                    swap (arr,low,high);
                    low++; high--;
                }
            }
            helper(arr,s,high);
            helper(arr,low,e);
        }
        public static void swap (int [] arr, int i ,int j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
