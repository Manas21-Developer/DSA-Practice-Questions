import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NextGreaterElementLeftNGEF {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, -1));
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            if (!stack.isEmpty()) {
                ans.set(i, stack.peek());
            }
            stack.push(arr[i]);
        }
        return ans;
    }

    public static void main(String[]args) {
        NextGreaterElementLeftNGEF obj = new NextGreaterElementLeftNGEF();
        int[] arr = {1, 3, 2, 4};
        System.out.println(obj.nextLargerElement(arr)); // Output: [-1, -1, 3, -1]
    }
}

