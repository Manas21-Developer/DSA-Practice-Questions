package ArrayDay1;
import java.util.*;
public class SumOfArrayExceptSelf {
    public static int[] SumArrayExpectSelf(int[] nums, int n) {
        int [] ans = new int[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] Ans = SumArrayExpectSelf(nums, n);

        for(int a : Ans)
            System.out.print(a + " ");
    }
}
