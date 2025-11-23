public class BSonInfiteRange {
    static int range (int [] arr, int target)
    {
        int s = 0;
        int e = 1;
        while(arr[e]<  target){
            s = e;
            e *= 2;
        }
        while (s<=e)
        {
            int mid = s+(e-s)/2;
            if (arr[mid] == target) return mid ;
            else if(arr[mid] > target ) e = mid-1;
            else s = mid+1;
        }return -1;
    }
}
