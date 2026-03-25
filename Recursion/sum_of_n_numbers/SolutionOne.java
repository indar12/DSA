package sum_of_n_numbers;

// Brute force approach
// Time Complexity: O(N)
// Space Complexity: O(1)
public class SolutionOne {
    public static void main(String[] args) {
        int n = 5;
        int sum = sumOfNNumbers(n);
        System.out.println("The sum of first " + n + " numbers is: " + sum);
    }

    public static int sumOfNNumbers(int n) {
        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum += i;
        }

        return sum;
    }
}
