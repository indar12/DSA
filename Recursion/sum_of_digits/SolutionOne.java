package sum_of_digits;

public class SolutionOne {
    // Iterative approach
    // Time Complexity: O(log N) - because we are summing the digits of the number, which has log N digits
    // Space Complexity: O(1) - we are using a constant amount of space to store the sum and the input number
  public static int addDigits(int num) {
        while (num >= 10) { // more than one digit
            int sum = 0;

            while (num > 0) {
                sum += num % 10; // last digit
                num /= 10;       // remove last digit
            }

            num = sum;
        }
        return num;
    }

    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num)); // Output: 2
    }
}
