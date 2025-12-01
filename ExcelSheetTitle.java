import java.util.*;

public class ExcelSheetTitle {

    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; // adjust because Excel columns are 1-indexed
            int rem = columnNumber % 26;
            char ch = (char) ('A' + rem);
            sb.append(ch);
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter column number: ");
        int n = sc.nextInt();

        String result = convertToTitle(n);
        System.out.println("Excel Column Title: " + result);
    }
}
