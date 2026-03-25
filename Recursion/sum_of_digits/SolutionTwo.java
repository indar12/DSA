package sum_of_digits;

public class SolutionTwo {
    // Optimized approach using digital root concept
    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public static int addDigits(int num) {
        if (num <= 9) {
            return num;
        } else {
            return 1 + (num - 1) % 9;
        }
    }

    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num)); // Output: 2
    }
}
