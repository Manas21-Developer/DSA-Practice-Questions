package ArrayDay1;

import java.util.Scanner;

public class MaximumDiffBtwEleInArr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        ArrayProblem(arr);
    }


    public static void ArrayProblem(int []arr) {
        int diff = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0;i<n;i++)
        {
            for(int j =i+1;i<n;j++)
            {
                int curr = Math.abs(arr[i] -arr[j]);
                diff = Math.max(curr , diff);
            }
        }
        System.out.println(diff);
    }
}
