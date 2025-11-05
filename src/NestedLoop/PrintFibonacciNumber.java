package NestedLoop;
import java.util.*;
public class PrintFibonacciNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d0 =0;
        int d1 = 1;
        if (n >= 1) {
            System.out.println(d0);
        }
        if (n >= 2) {
            System.out.println(d1);
        }
        for (int i = 2; i < n; i++) {
            int next = d0+d1;
            System.out.println(next);
            d0 = d1;
            d1 = next;
        }
    }
}
