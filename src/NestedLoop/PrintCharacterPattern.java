package NestedLoop;

import java.util.*;

public class PrintCharacterPattern {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        //int len = String.valueOf(n).length();
        for (int i =0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(ch);
            }
            System.out.println();
            ch++;
        }
    }
}
