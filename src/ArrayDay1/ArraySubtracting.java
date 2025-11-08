package ArrayDay1;

import java.util.SortedMap;

public class ArraySubtracting {

    static int[] subtract(int[] n1, int[] n2) {
        int n = n1.length;
        int m = n2.length;
        int val1 =helper(n1,n);
        int val2 =helper(n2,m);
        int sub = val1 -val2;
        String no = String.valueOf(sub);
        int len = no.length();
        int [] ans = new int[len];
        for(int i =0;i<len;i++)
        {
            char ch = no.charAt(i);
            ans[i] = ch;
        }
        return ans;
    }

    static int helper(int [] arr, int n)
    {
        StringBuilder temp  = new StringBuilder();
        for (int i = 0; i < n; i++) {
            temp.append(arr[i]);
        }
        int ans = Integer.parseInt(temp.toString());
        return ans;
    }
}
