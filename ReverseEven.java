public class ReverseEven {

    public static int[] Reverse(int arr[]) {
        int n = arr.length;
        int l = 0, r = n - 1;

        while (l < r) {

            // move l until it finds an even number
            while (l < r && arr[l] % 2 != 0) l++;

            // move r until it finds an even number
            while (l < r && arr[r] % 2 != 0) r--;

            // swap if valid
            if (l < r) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                l++;
                r--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] ans = Reverse(arr);

        for (int x : ans)
            System.out.print(x + " ");
    }
}
