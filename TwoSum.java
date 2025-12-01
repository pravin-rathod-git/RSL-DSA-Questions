import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int l = 0;
        int r = n - 1;

        while (l < r) {
            int sum = numbers[l] + numbers[r];

            if (sum == target) {
                return new int[]{l + 1, r + 1}; // 1-indexed
            } else if (sum < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[]{}; // no solution (problem guarantees one)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int[] ans = twoSum(numbers, target);

        if (ans.length == 0) {
            System.out.println("No pair found");
        } else {
            System.out.println("Indices (1-indexed): " + ans[0] + " " + ans[1]);
        }
    }
}
