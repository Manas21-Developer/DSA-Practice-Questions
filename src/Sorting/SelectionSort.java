package Sorting;
import java.util.*;
public class SelectionSort {
    public static int[] SelectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0 ; i<n ; i++)
        {
            int lastIdx = n-i-1;
            int max = findMax(arr,0,lastIdx);
            swap (arr , lastIdx , max);
        }return arr;
    }
    public static int findMax (int [] arr , int s , int e)
    {
        int max = s;
        for (int i = s;i<=e ; i++)
        {
            if (arr [i] > arr[max])
            {
                max = i;
            }
        }return max;
    }
    public static void swap (int [] arr, int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] ans = SelectionSort(arr);

        for(int a : ans)
            System.out.print(a + " ");
    }
}
