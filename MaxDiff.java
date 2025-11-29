import java.util.*;


public class MaxDiff {

    public static String maximumDifference(int n, int[] arr) {

        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
            if (arr[i] > large) {
                large = arr[i];
            }
        }

        int diff = large - small;

        if ((diff & 1) != 0) {
            return "ODD";
        }

        return "EVEN";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        int n = sc.nextInt();

        // Input array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Function call
        String result = maximumDifference(n, arr);

        // Output
        System.out.println(result);

        sc.close();
    }
}
