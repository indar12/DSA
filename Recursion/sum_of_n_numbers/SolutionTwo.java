package sum_of_n_numbers;

// Head Recursive approach
// Time Complexity: O(N)
// Space Complexity: O(N) - due to recursive call stack
public class SolutionTwo {
    public static int sumN(int N){

        if(N == 0)
            return 0;

        return sumN(N - 1) + N;
    }

    public static void main(String[] args){
        System.out.println(sumN(4));
    }
}
