package sum_of_digits;

public class SolutionThree {
    // Recursive approach
    // Time Complexity: O(log N) - due to recursive calls on the number of digits
    // Space Complexity: O(log N) - due to recursive call stack
    public static int addDigits(int num) {
        if(num < 10){
            return num;
        }
        int sum = sumDigits(num);
        return addDigits(sum);
    }

    public static int sumDigits(int num){
        if(num == 0){
            return 0;
        }
        return sumDigits(num/10) + (num % 10);
    }

    public static void main(String[] args) {
        int num = 38;
        System.out.println(addDigits(num)); // Output: 2
    }
}
