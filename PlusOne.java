public class PlusOne {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                return digits;   // No carry needed beyond this point
            }
            digits[i] = 0;        // Set 9 → 0 and continue carry
        }

        // If all digits were 9, we need a new array: e.g., 999 + 1 = 1000
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9};

        int[] result = plusOne(digits);

        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num);
        }
    }
}
