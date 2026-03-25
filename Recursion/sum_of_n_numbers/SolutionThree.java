package sum_of_n_numbers;

// Tail Recursive approach
// Time Complexity: O(N)
// Space Complexity: O(N) - due to recursive call stack
public class SolutionThree {
    public static int sumN(int N, int sum){

        if(N == 0)
            return sum;

        return sumN(N - 1, sum + N);
    }

    public static void main(String[] args){
        System.out.println(sumN(4, 0));
    }
}
