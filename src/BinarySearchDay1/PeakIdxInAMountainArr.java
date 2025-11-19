package BinarySearchDay1;

import java.io.*;
import java.util.*;

class solution {
    public int peakIndexInMountainArray(int[] A) {
        int s = 0 ; int e = A.length-1;
        while (s<=e)
        {
            int mid = s + (e-s)/2;
            if(s == e) return s;
            else if (A[mid] <A[mid+1]) s= mid+1;
            else e = mid;
        }return -1;
    }
}

public class PeakIdxInAMountainArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();
        solution Obj = new solution();
        int result = Obj.peakIndexInMountainArray(arr1);
        System.out.print(result + " ");
        System.out.println('\n');
    }
}


