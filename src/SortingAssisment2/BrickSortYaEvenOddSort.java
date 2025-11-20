package SortingAssisment2;
import java.util.*;
public class BrickSortYaEvenOddSort {
    static void oddEvenSort(int arr[], int n)
    {
        boolean sorted = false;
        while(!sorted)
        {
            sorted = true;

            // odd phase :- (1,2) (3,4)...
            for (int i = 1;i<=n-2;i= i+2)
            {
                if(arr[i] > arr[i+1]) {
                    swap(arr, i, i + 1);
                    sorted = false;
                }
            }


            // even phase :- (0,2) (2,4)
            for (int i = 0 ; i<=n-2; i= i+2)

            {
                if (arr[i] > arr[i+1]) {
                    swap(arr , i , i+1);
                    sorted = false;
                }
            }
        }
    }
    public static void swap (int [] arr , int i , int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] array = new int[n];

        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        oddEvenSort(array,n);
    }
}
