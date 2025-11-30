import java.util.*;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int prev1 = 1; // ways to reach step 1
        int prev2 = 2; // ways to reach step 2

        int curr = 0;

        for (int i = 3; i <= n; i++) {
            curr = prev1 + prev2;  // Fibonacci relation
            prev1 = prev2;
            prev2 = curr;
        }

        return curr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = climbStairs(n);
        System.out.println("Number of distinct ways: " + result);
    }
}
