package MergeAndQuickSort;


import java.util.*;
import java.io.*;

class Solution {
    static void mergeSort(int[] arr,int s,int e){
        if (s >= e) return ;
        int mid = s + (e-s)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);

        merge(arr,s,mid ,e);
    }
    static void merge(int [] arr, int s,int mid, int e)
    {
        //int mid = s +(e-s) /2;

        int len1 = mid-s+1;
        int len2 = e-mid;

        int [] left = new int [len1];
        int [] right = new int [len2];

        int k = s;
        for (int i = 0 ; i<len1 ; i++)
        {
            left[i] =arr[k++];
        }

        //int k = mid+1;
        for (int i = 0; i<len2;i++)
        {
            right[i] = arr[k++];
        }

        //merge 2 sorted arr
        int idx1 = 0; int idx2 =0;
        k =s;
        while (idx1 <len1 && idx2<len2)
        {
            if (left[idx1] <right[idx2])
            {
                arr[k++] = left[idx1++];
            }else
            {
                arr[k++] = right[idx2++];
            }
        }
        while (idx1 < len1)
        {
            arr[k++] = left[idx1++];
        }
        while (idx2 < len2)
        {
            arr[k++] = right[idx2++];
        }
    }
}
public class MergeSort {
    public static void main(String args[]) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] a=new int[n];
        for(int i= 0; i < n; i++)
            a[i] = input.nextInt();
        Solution Obj = new Solution();
        Obj.mergeSort(a,0,n-1);
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}



