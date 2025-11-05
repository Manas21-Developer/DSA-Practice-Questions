package NestedLoop;

import java.util.*;

public class PrintContinuousCharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.close();
        for (int i =0;i<n;i++)
        {
            for(int j = 0;j<=i;j++)
            {
                char ch = (char)('A'+ (i+j)%26);
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
