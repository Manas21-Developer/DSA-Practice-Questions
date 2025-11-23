package BinarySearchDay1;

public class RotatedSortedArr {
    public int helper (int  [] arr)
    {
        int s = 0 ; int e =arr.length-1;
        while (s<= e){
            int mid = s+(e-s)/2;
            if (mid >s && arr[mid] <arr[mid-1]) return mid-1;
            else if (mid <e && arr[mid] > arr[mid+1]) return mid;
        }return -1;
    }


    public void search(final int[] a, int target) {

    }
}
