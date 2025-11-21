package BinarySearch2;

public class PeakIndexInMontainArr {
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

