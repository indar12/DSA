package reverse_string_array;

import java.util.Arrays;

public class SolutionOne {
    // Brute force approach
    // Time Complexity: O(N) - due to single loop to reverse the string
    // Space Complexity: O(N) - due to temporary array used for reversal
    public static void reverseString(char[] s){
        int n = s.length;
        char[] temp = new char[n];

        for(int i=0;i<n;i++){
            temp[i] = s[n-1-i];
        }
        for(int i=0;i<n;i++){
            s[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};

        reverseString(s);

        System.out.println(Arrays.toString(s));
    }
}
