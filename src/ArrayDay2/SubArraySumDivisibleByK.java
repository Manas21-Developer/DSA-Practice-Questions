package ArrayDay2;
import java.util.*;

public class SubArraySumDivisibleByK {
    public static int subarrayDivisbleByK(int arr[], int n, int k){
        int cnt = 0;
        for (int i =0;i<n;i++)
        {
            for (int j =i;j<n;j++)
            {
                int sum = arr[i] +arr[j];
                if(sum %k ==0) cnt++;
            }
        }return  cnt;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        int result = subarrayDivisbleByK(arr, n, k);
        System.out.print(result);
        System.out.println('\n');
    }
}
