package last_remaining_integer_after_alter_deletion;

public class SolutionThree {

    public static long lastRemaining(long n) {
        long head = 1;
        long step = 1;
        boolean leftToRight = true;

        while (n > 1) {

            long increment = (leftToRight || n % 2 != 0) ? 0 : step;
            head = head + increment;

            n = n - n / 2;
            step = step * 2;
            leftToRight = !leftToRight;
        }

        return head;
    }
    public static void main(String[] args) {
        long n = 8;
        System.out.println("last:" + lastRemaining(n)); // 3
    }
}
