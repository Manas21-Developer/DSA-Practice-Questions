package MonotonicStack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElementInRightNGER {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n,-1));
        for(int i =n-1;i>=0;i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if(!stack.isEmpty()){
                ans.set(i, stack.peek());
            }
            stack.push(arr[i]);
        }return ans;
    }
}
