package fibonacci_number_sum;

public class SolutionTwo {

        //optimiZed approach using loop
        // Time Complexity: O(N)
        // Space Complexity: O(1)
        public static int fib(int n) {
            if(n <= 1) {
                return n;
            }

           int prev1 = 0, prev2 = 1, curr = 0;
            for(int i = 2; i <= n; i++) {
                curr = prev1 + prev2;
                prev1 = prev2;
                prev2 = curr;
            }

            return curr;
        }
        public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
