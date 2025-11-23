package ArrayDay1;

public class SecondLargestInArr {
    public static void SecondLargest(int[] arr, int n) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        if (n<2)
        {
            System.out.println(-1);
            return;
        }

        for (int i =0 ; i<n ;i++)
        {
            if(arr[i] > max1)
            {
                max1 = arr[i];
            }
        }
        for (int i =0 ; i<n ; i++)
        {
            if (arr[i] > max2 && arr[i] < max1)
            {
                max2 = arr[i];
            }
        }
        if (max2 == Integer.MIN_VALUE) System.out.println(-1);
        else System.out.print(max2);
    }
}
