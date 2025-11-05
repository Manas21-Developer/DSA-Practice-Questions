package  ArrayDay1;
import java.io.*;
import java.util.*;


public class ArrayProblem4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        n = sc.nextInt();
        int []arrA=new int[n];
        for(int i=0;i<n;++i){
            arrA[i]=sc.nextInt();
        }

        n = sc.nextInt();
        int []arrB=new int[n];
        for(int i=0;i<n;++i){
            arrB[i]=sc.nextInt();
        }

        System.out.println(ArrayProblem(arrA,arrB));
    }
    public static String ArrayProblem(int []arrA,int []arrB){
       int n = arrA.length;
       int m = arrB.length;
       int sum1 =0;
       int sum2 =0;
       String s1 = "First array is larger";
       String s2 = "Second array is larger";
       String s3 = "Both are equal";
       for (int i =0;i<n;i++)
       {
           sum1+= arrA[i];
       }
       for (int i=0;i<m;i++)
       {
           sum2+= arrB[i];
       }
       if (sum1 >sum2)
       {
           return s1;
       } else if (sum1 <sum2) {
           return s2;
       }else {
           return s3;
       }
    }
}