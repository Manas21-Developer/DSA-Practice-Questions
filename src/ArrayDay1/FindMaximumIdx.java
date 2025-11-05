import java.util.*;

public class FindMaximumIdx {
    public static void main(String[] args) {
        // Define the array directly
        int[] arr = {10, 45, 23, 89, 12};
        int n = arr.length;

        // Call the function to find index of maximum element
        int ans = ArrayProblem1(n, arr);

        // Print results
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Index of Maximum Element: " + ans);
        System.out.println("Maximum Element: " + arr[ans]);
    }

    // Function to find index of maximum element
    public static int ArrayProblem1(int n, int[] arr) {
        int idx = 0;
        long max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                idx = i;
            }
        }
        return idx;
    }
}
