package ArrayDay1;
import  java.util.*;

public class ArrayProblem6 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int ans=ArrayProblem6(n,arr);
        System.out.println(ans);
    }
    public static int ArrayProblem6(int n, int[] arr){
        int dis = Integer.MAX_VALUE;

        for (int i = 0;i<n;i++)
        {
            int fidx =0;
            if (arr[i]%2 ==0)
            {
                fidx = i;
            }
            for (int j = i+1;j<n-1;j++)
            {
                int sidx =0;
                if (arr[j]%2 ==0)
                {
                    sidx = j;
                    int diff = sidx -fidx;
                    dis = Math.min(diff , dis);
                }
            }
        }
        if(dis == Integer.MAX_VALUE) {
            return -1;
        }
        return dis;
    }
}
