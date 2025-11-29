public class NumberOfModification{

    public static boolean checkPossibility(int[] arr) {
        int count = 0; // number of modifications made

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {  // violation
                count++;

                // More than 1 modification required
                if (count > 1) return false;

                // If we can lower arr[i]
                if (i == 0 || arr[i - 1] <= arr[i + 1]) {
                    arr[i] = arr[i + 1];
                } else {
                    // otherwise raise arr[i + 1]
                    arr[i + 1] = arr[i];
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 3};
        System.out.println(checkPossibility(arr));  // true

        int[] arr2 = {4, 2, 1};
        System.out.println(checkPossibility(arr2)); // false
    }
}
