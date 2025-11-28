public class SumOfDuplicate {

    public int Sum(int arr[]) {
        int n = arr.length;
        int sum = 0;
        int i = 0;

        while (i < n - 1) {

            if (arr[i] == arr[i + 1]) {
                sum += arr[i];          // add duplicate value once
                int value = arr[i];

                // skip entire block of duplicates safely
                while (i < n - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
            }

            i++;
        }

        return sum;
    }

    public static void main(String[] args) {

        SumOfDuplicate obj = new SumOfDuplicate();

        int arr[] = {1, 2, 2, 3, 4, 4, 4, 5};

        int result = obj.Sum(arr);

        System.out.println("Sum of duplicates: " + result);
    }
}
