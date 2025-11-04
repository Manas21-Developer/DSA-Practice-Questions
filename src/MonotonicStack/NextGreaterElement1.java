package MonotonicStack;

import java.util.*;

public class NextGreaterElement1 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length; int n = nums2.length;

        Stack<Integer> stack = new Stack<>();
        int [] ans = new int [m];
        Map<Integer,Integer> map = new HashMap<>();
        // fill map with -1.
        for(int i :nums2){
            map.put(i,-1);
        }
       // calculate the NGER for nums2.
        for (int i = n-1;i>=0;i--)
        {
            while (!stack.isEmpty() && stack.peek() <= nums2[i])
            {
                stack.pop();
            }
            if (!stack.isEmpty())
            {
                map.put(nums2[i],stack.peek());
            }
            stack.push(nums2[i]);
        }
        //fill ans array with the help of map
        for (int i =0;i<m;i++)
        {
            int val = nums1[i];
           /*     if(map.containsKey(val))
                {
                    ans[i] = map.get(val);
                }*/
            ans[i] = map.getOrDefault(val,-1);
        }return  ans;
    }
}
