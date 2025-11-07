package StringDay1;

import java.util.Scanner;

public class Hey {

    static String hey(String str)
    {
        int cnt =0;
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str.length();i++) {
        char c = str.charAt(i);
        if (c == 'e') cnt ++;
        }
        cnt = cnt +cnt;
        sb.append('h');
        for (int i =0;i<cnt;i++) {
            sb.append('e');
        }
        sb.append('y');
        String ans = sb.toString();
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String result = hey(str);
        System.out.print(result);
        System.out.println('\n');
    }
}

