package reverse_string_array;

import java.util.ArrayList;

public class SolutionThree {

    // Recursive approach using two pointers
    // Time Complexity: O(N) - due to single loop to reverse the string
    // Space Complexity: O(N) - due to recursive call stack
        public static ArrayList<Character> reverseString(ArrayList<Character> s) {
        //your code goes here
        helper(s, 0, s.size()-1);
        return s;
    }

    public static void helper(ArrayList<Character> s, int left, int right){
        if(left >= right) return;

        char temp = s.get(left);
        s.set(left, s.get(right));
        s.set(right, temp);

        helper(s, left+1, right-1);
    }

    public static void main(String[] args) {
        ArrayList<Character> s = new ArrayList<>();
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');
        
        // Function call to reverse the given string
        ArrayList<Character> reversed = reverseString(s);
        System.out.println(reversed);
    }
}
