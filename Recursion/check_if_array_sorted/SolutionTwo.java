package check_if_array_sorted;

public class SolutionTwo {

    // Optimized approach
    // Time Complexity: O(N) - due to single loop
    // Space Complexity: O(1) - no extra space used
    public static boolean isSorted(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr));
    }
}
