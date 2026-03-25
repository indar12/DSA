package sum_of_n_numbers;

// Formula approach - most efficient approach
// Time Complexity: O(1)
// Space Complexity: O(1)
public class SolutionFive {
    public static int sumN(int N){
        return N * (N + 1) / 2;
    }

    public static void main(String[] args){
        System.out.println(sumN(4));
    }
}
