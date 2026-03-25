package reverse_string_array;

import java.util.Arrays;

public class SolutionTwo {
    // Optimized approach using two pointers
    // Time Complexity: O(N) - due to single loop to reverse the string
    // Space Complexity: O(1) - no extra space used for reversal
    public static void reverseString(char[] s){
        int left = 0;
        int right = s.length - 1;

        while(left < right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};

        reverseString(s);

        System.out.println(Arrays.toString(s));
    }
}
