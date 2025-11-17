public class BinarySearch {
    public static void main(String args[]) {
        int [] arr = {5,6,4,1,7,9};
        int target = 7;
        int ans = bruteForce(arr,target);
        System.out.println(ans);
    }
    public static  int bruteForce (int [] arr, int target)
    {
        int n = arr.length;
        for (int i = 0 ; i<n ;i++)
        {
            if (arr[i] == target) return i;
        }return -1;
    }
}
