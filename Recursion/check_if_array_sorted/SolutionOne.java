package check_if_array_sorted;

public class SolutionOne {

    // Brute force approach
    // Time Complexity: O(N^2) - due to nested loops
    // Space Complexity: O(1) - no extra space used
    public static boolean isSorted(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr));
    }
}
