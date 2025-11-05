package ArrayDay1;

import java.util.*;
public class ArrayProblem5 {
    public static int ArrayProblem(int []arr,int k){
        int cnt =0;
        for (int i =0;i<arr.length-1;i++)
        {
            int sum = arr[i]+arr[i+1];
            if (sum == k) cnt++;
        }return  cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        System.out.println(ArrayProblem(arr,k));
    }
}
