import java.util.*;

public class HourglassMaxSum {

    // Function to calculate max hourglass sum
    public static int maxHourglassSum(int[][] arr) {

        int maxSum = Integer.MIN_VALUE;

        // Loop for all possible hourglasses
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {

                int sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                        + arr[i+1][j+1]
                        + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[6][6];

        System.out.println("Enter 6x6 matrix:");

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int result = maxHourglassSum(arr);
        System.out.println("Maximum Hourglass Sum = " + result);
    }
}
