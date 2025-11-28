import java.util.*;

public class ArrangeBinnaryInDescending {
    private static int BinaryToInteger(String s) {
        int n = s.length();
        int value = 0;
        for (int i = 0; i < n; i++) {
            int ch = s.charAt(i) - '0';
            value = value * 2 + ch;
        }
        return value;
    }

    public static String[] SortBinary(String[] binary) {
        int n = binary.length;
        Arrays.sort(binary, (a, b) -> BinaryToInteger(b) - BinaryToInteger(a));
        return binary;
    }

    public static void main(String[] args) {
        String[] arr = { "101", "11", "110", "10", "111", "001" };

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(arr));

        SortBinary(arr);

        System.out.println("\nAfter Sorting in Descending (based on integer value):");
        System.out.println(Arrays.toString(arr));
    }

}
