package MonotonicStack;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextSmallerElementinLeftNSEL {
    public ArrayList<Integer> nextSmallerElement(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack <>();
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n,-1));
        for (int i =0; i<n;i++)
        {
            while (!stack.isEmpty() && stack.peek() >=arr[i])
            {
                stack.pop();
            }
            if(!stack.isEmpty())
            {
                ans.set(i,stack.peek());
            }
            stack.push(arr[i]);
        }return ans;
    }
    public static void main(String[] args) {
        NextSmallerElementinLeftNSEL obj = new NextSmallerElementinLeftNSEL();
        int[] arr = {4, 5, 2, 10, 8};
        System.out.println(obj.nextSmallerElement(arr)); // Output: [-1, 4, -1, 2, 2]
    }
}
