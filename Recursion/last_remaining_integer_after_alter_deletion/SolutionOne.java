package last_remaining_integer_after_alter_deletion;


import java.util.ArrayList;
import java.util.List;

public class SolutionOne {
    // Brute force approach
    // Time Complexity: O(N) - due to repeated iterations over the list
    // Space Complexity: O(N) - due to temporary list used for storing remaining integers
    public static int lastRemaining(int n){
        List<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++){
            list.add(i);
        }
        System.out.println(list);

        boolean leftToRight = true;

        while(list.size() > 1){
            List<Integer> temp = new ArrayList<>();
            if(leftToRight){
                for(int i=0;i<list.size();i++){
                    if(i%2 == 0){
                        temp.add(list.get(i));
                    }
                }
            }
            else {
                for(int i=list.size() - 1; i>=0; i--){
                    if((list.size() - 1 - i) % 2 == 0){
                        temp.add(0, list.get(i)); // maintain order
                    }
                }
            }

            list = temp;
            leftToRight = !leftToRight;
            System.out.println(list);
        }
        return list.get(0);
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println("last:" + lastRemaining(n)); // 3
    }
}
