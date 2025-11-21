package BinarySearch2;

public class PeakEle {
    public int findPeak(int arr[], int n)
    {
        int s= 0 ;
        int e =n-1;
        while(s<=e)
        {
            int mid = s+ (e-s)/2;
            if (s==e) return s;
            else if (arr[mid] < arr[mid+1]) s=mid+1;
            else e = mid;
        }return -1;
    }
}
