package ArrayDay1;

public class ArrayAdding {
    static int[] calSum(int a[], int b[], int n, int m) {
        int len= Math.max(n,m);
        int [] ans = new int[len+1];
        int carry =0;
        int i =n-1 , j=m-1 , k=ans.length-1;
        while(i>=0 || j>=0)
        {
            int v1 = (i>=0) ? a[i] :0;
            int v2 = (j>=0) ? b[j] :0;
            int sum = v1 +v2 + carry;
            ans[k--] = sum%10;
            carry = sum/10;
            i-- ; j-- ;
        }
        if(carry >0)
        {
            ans[k] = carry;
        }return ans;
    }
}
