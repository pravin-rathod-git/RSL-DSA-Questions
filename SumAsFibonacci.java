import java.util.ArrayList;
import java.util.Scanner;

public class SumAsFibonacci {

    public static int NumberRequired(int sum) {
        ArrayList<Integer> fib = new ArrayList<>();
        fib.add(1);
        fib.add(2);

        // Generate Fibonacci numbers up to 'sum'
        while (fib.get(fib.size() - 1) <= sum) {
            int size = fib.size();
            int num = fib.get(size - 1) + fib.get(size - 2);
            fib.add(num);
        }

        int rem = sum;
        int count = 0;

        // Greedy: subtract the largest Fibonacci number <= rem
        for (int i = fib.size() - 1; i >= 0 && rem > 0; i--) {
            if (fib.get(i) <= rem) {
                rem -= fib.get(i);
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter SUM: ");
        int sum = sc.nextInt();

        int result = NumberRequired(sum);

        System.out.println("Minimum Fibonacci numbers needed = " + result);
    }
}
