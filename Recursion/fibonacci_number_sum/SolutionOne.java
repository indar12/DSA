package fibonacci_number_sum;

public class SolutionOne {

    // Brute force approach
    // Time Complexity: O(2^N) - due to repeated calculations of the same Fibonacci numbers
    // Space Complexity: O(N) - due to recursive call stack
    public static int fib(int n) {
        if(n <= 1) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
