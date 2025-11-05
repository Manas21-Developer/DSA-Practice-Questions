package NestedLoop;

import java.util.*;
public class WhichAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        int [] ans= {a,b,c};
        Arrays.sort(ans);
        long x = ans[0];
        long y = ans[1];
        long z = ans[2];
        long x2 = x*x;
        long y2 = y*y;
        long z2 = 2*(z*z);

        long otherSqr = x2+y2;
        if(z2<otherSqr)
        {
            System.out.println(1);
        }
        else if(z2 >otherSqr)
        {
            System.out.println(2);
        }else {
            System.out.println(3);
        }

    }
}