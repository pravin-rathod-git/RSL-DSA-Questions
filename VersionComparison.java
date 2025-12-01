import java.util.*;

public class VersionComparison {

    public static int compareVersion(String version1, String version2) {

        int i = 0, j = 0;
        int n1 = version1.length();
        int n2 = version2.length();

        while (i < n1 || j < n2) {
            int num1 = 0;
            int num2 = 0;

            // Extract next revision from version1
            while (i < n1 && version1.charAt(i) != '.') {
                num1 = num1 * 10 + (version1.charAt(i) - '0');
                i++;
            }

            // Extract next revision from version2
            while (j < n2 && version2.charAt(j) != '.') {
                num2 = num2 * 10 + (version2.charAt(j) - '0');
                j++;
            }

            // Compare revisions
            if (num1 < num2) return -1;
            if (num1 > num2) return 1;

            // Skip dots
            i++;
            j++;
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter version1: ");
        String v1 = sc.nextLine();

        System.out.print("Enter version2: ");
        String v2 = sc.nextLine();

        int result = compareVersion(v1, v2);

        System.out.println("Comparison Result: " + result);
    }
}
