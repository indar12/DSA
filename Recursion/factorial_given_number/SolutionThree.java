package factorial_given_number;

// Tail Recursive approach
// Time Complexity: O(N)
// Space Complexity: O(N) - due to recursive call stack
public class SolutionThree {
    public static long factorial(int n, long result) {

        if(n == 0 || n == 1)
            return result;

        return factorial(n - 1, result * n);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5, 1));
    }
}
