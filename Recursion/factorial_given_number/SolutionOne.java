package factorial_given_number;

// Brute force approach
// Time Complexity: O(N)
// Space Complexity: O(1)
public class SolutionOne {
    public static long factorial(int n) {

        long result = 1;

        for(int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
