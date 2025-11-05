package ArrayDay2;

import java.util.Scanner;

public class MaximumSumSubArray {
    // Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        sc.close();
        System.out.println(maxSubArraySum(arr));
    }

    // Function Call
    static int maxSubArraySum(int a[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<a.length;i++)
        {
            int sum =0;
            for (int j = i;j<a.length;j++)
            {
                sum += a[j];
                max = Math.max(sum , max);
            }
        }return max;
    }
}
