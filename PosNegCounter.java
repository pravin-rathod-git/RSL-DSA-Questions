public class PosNegCounter {
    public static int Counter(int[] arr){
        int n = arr.length;
        int l = 0;
        int r = n - 1;

        while (l < r){
            int sum = arr[l] + arr[r];

            if (sum == 0) {
                // arr[r] is positive and its negative exists
                return arr[r];
            }
            else if (sum < 0) {
                // Need a larger number → move left pointer forward
                l++;
            } else {
                // Sum > 0 → need a smaller positive → move right pointer backward
                r--;
            }
        }

        return -1; // no such pair exists
    }

    public static void main(String[] args){
        int arr[] = {-10, -5, -3, -1, 1, 3, 5, 9};
        System.out.println(Counter(arr));  
    }
}
