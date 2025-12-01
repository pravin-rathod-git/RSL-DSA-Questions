import java.util.*;

public class CovertTitleToNumber {

    public static int titleToNumber(String columnTitle) {
        int result = 0;

        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            int value = c - 'A' + 1;  // A=1, B=2, ..., Z=26
            result = result * 26 + value;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Column Title: ");
        String columnTitle = sc.nextLine();

        int answer = titleToNumber(columnTitle);
        System.out.println("Column Number: " + answer);

        sc.close();
    }
}
