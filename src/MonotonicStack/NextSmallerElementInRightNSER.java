package MonotonicStack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextSmallerElementInRightNSER {
    public ArrayList<Integer> nextSmallerElementRight(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n,-1));
        for(int i = n-1;i>=0;i--)
        {
            while (!stack.isEmpty() && stack.peek() >= arr[i])
            {
                stack.pop();
            }
            if(!stack.isEmpty())
            {
                ans.set(i,stack.peek());
            }
            stack.push(arr[i]);
        }return  ans;
    }
    public static void main(String[] args) {
        NextSmallerElementInRightNSER obj = new NextSmallerElementInRightNSER();
        int[] arr = {4, 8, 5, 2, 25};
        System.out.println(obj.nextSmallerElementRight(arr));
        // Output: [2, 5, 2, -1, -1]
    }
}