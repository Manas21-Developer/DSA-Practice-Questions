package Sorting;

import java.io.*;
import java.util.*;
public class BubbleSortPrintNoOfSwapAndFirstEleAndLastEle {
    static void bubbleSort(int a[], int n)
    {
        int cnt = 0;
        for (int i = 0 ; i<n; i++)
        {
            for (int j = 0 ; j<n-i-1;j++)
            {
                if (a[j] > a[j+1])
                {
                    cnt++;
                    swap (a,j, j+1);
                }
            }
        }
        System.out.println(cnt);
        System.out.println(a[0]);
        System.out.println(a[n-1]);
    }
    static void swap (int [] arr , int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        bubbleSort(arr1, n);
    }

}

