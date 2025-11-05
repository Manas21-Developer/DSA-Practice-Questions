package NestedLoop;

import java.util.*;

public class PalinDromeChecker {

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            String no = String.valueOf(Math.abs(n));
            int len = no.length();
            boolean isPlanidrome = true;
            for(int i = 0;i<len/2;i++)
            {
                    if(no.charAt(i) != no.charAt(len-i-1))
                    {
                        isPlanidrome = false;
                        break;
                    }
            }
            System.out.println(isPlanidrome);
            sc.close();
        }
}
