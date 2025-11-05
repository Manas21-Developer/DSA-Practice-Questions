package NestedLoop;
import java.util.*;

public class CheckArmStringNoOf3Digit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(1);
        for (int i= 100;i<=N;i++)
        {
            int temp = i;
            long d1 = temp%10;
            long d2 = (temp/10)%10;
            long d3 = (temp/100)%10;
            d1 = d1*d1*d1; d2= d2*d2*d2; d3 = d3*d3*d3;
            long sum = d1+d2+d3;
            if(i == sum)
            {
                System.out.println(i);
            }
        }
    }
}
