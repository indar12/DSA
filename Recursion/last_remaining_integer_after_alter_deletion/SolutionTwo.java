package last_remaining_integer_after_alter_deletion;

//best explanation for this problem
//https://leetcode.com/problems/last-remaining-integer-after-alternating-deletion-operations/solutions/7446625/intuitive-ologn-solution-with-recursion-o4gc3/?envType=problem-list-v2&envId=recursion
public class SolutionTwo {
    // Optimized approach using recursion and mathematical pattern
    // Time Complexity: O(log N) - due to recursive halving of the problem size
    // Space Complexity: O(log N) - due to recursive call stack
    public static long solve(long n, long head, long step, boolean isLeft) {
        if (n == 1) {
            return head;
        }
        long increment = (isLeft || n % 2 != 0) ? 0 : step;
        return solve(n - n / 2, head + increment, step * 2, !isLeft);
    }

    public static long lastInteger(long n) {
        return solve(n, 1, 1, true);
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println("last:" + lastInteger(n)); // 3
    }
}
