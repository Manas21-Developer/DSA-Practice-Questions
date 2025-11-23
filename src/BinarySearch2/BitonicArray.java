package BinarySearch2;

public class BitonicArray {
    static int helper (int [] arr){
        int s = 0 ;
        int e = arr.length-1;
        while(s<=e)
        {
            int mid = s+ (e-s)/2;
            if (s==e) return s;
            else if (arr[mid] < arr[mid+1])  s = mid+1;
            else e = mid;
        }return -1;
    }
    static int BS (int [] arr , int s , int e , int target )
    {
        //int s = 0 ; int e = arr.length-1;
        while (s<=e)
        {
            int mid = s+(e-s)/2;
            if(arr[mid] == target) return mid;
            else if (arr[mid] <target) s= mid+1;
            else e =mid -1;
        }return -1;
    }
    static int DecBs(int [] arr , int s, int e ,int target )
    {
        while (s<=e){
            int mid  = s+(e-s)/2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) s= mid+1;
            else e=mid-1;
        }return -1;
    }


    static int findElement(int arr[], int n,int target)
    {
        int peak = helper(arr);
        int idx = BS(arr,0,peak,target);
        if (idx != -1) return idx;

        idx = DecBs(arr,peak+1, n-1,target);
        if(idx != 1) return idx;
        return -1;
    }
}
