package BinarySearch2;

public class PeakIdxInMountainArrInDiffFun {
    public int peakIndexInMountainArray(int[] A) {
        int n =A.length ;
        if (A[0] >A[1]) return 0;
        if (A[n-1] > A[n-2]) return n-1;

        int s = 1;
        int e = n-2;

        while (s<=e)
        {
            int mid = s+ (e-s)/2;
            if (A[mid] > A[mid-1] && A[mid] > A[mid+1]) return mid ;
            else if (A[mid] < A[mid+1]) s = mid+1;
            else e = mid-1;
        }return -1;
    }
}
