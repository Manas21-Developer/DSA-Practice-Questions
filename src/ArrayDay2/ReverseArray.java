package ArrayDay2;
import java.util.*;

public class ReverseArray {
    public static void reverseArray(int arr[])
    {
        int s =0;
        int e = arr.length-1;
        while (s<=e)
        {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();

        reverseArray(arr1);

        for (int i = 0; i < n; i++)
            System.out.print(arr1[i] + " ");
        System.out.println('\n');
    }
}
