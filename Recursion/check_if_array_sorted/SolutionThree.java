package check_if_array_sorted;

public class SolutionThree {
    // Recursive approach
    // Time Complexity: O(N) - due to recursive calls on each element
    // Space Complexity: O(N) - due to recursive call stack
    public static boolean isSorted(int[] nums){
        return check(nums, 0);
    }

    private static boolean check(int[] nums, int index){
        if(index == nums.length - 1){
            return true;
        }
        if(nums[index]>nums[index+1]){
            return false;
        }
        return check(nums, index+1);
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr));
    }
}
