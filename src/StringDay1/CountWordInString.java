package StringDay1;

import java.util.Scanner;
import java.util.Stack;

public class CountWordInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String p = sc.nextLine();
        while (t > 0) {
            String s = sc.nextLine();
            System.out.println(countWords(s));
            t--;
        }
    }

    public static int countWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();
        int cnt =0;
        for(int i = 0; i< s.length();i++)
        {
            char ch = s.charAt(i);
            while (ch <= 'a' || ch >='z')
            {
                sb.append(ch);
            }
            if (ch == ' ')
            {
                stack.push(sb.toString());
                sb = new StringBuilder(" ");
            }
        } return stack.size();
    }
}
