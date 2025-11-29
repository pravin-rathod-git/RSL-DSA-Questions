import java.util.*;

public class CountCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int charCount = 0;   // lowercase a-z
        int digitCount = 0;  // 0-9
        int spaceCount = 0;  // ' ' , '\t' , '\n'

        while (true) {
            char ch = sc.next().charAt(0);

            if (ch == '$') {
                break;
            }

            if (ch >= 'a' && ch <= 'z') {
                charCount++;
            } else if (ch >= '0' && ch <= '9') {
                digitCount++;
            } else if (ch == ' ' || ch == '\t' || ch == '\n') {
                spaceCount++;
            }
        }

        System.out.println(charCount + " " + digitCount + " " + spaceCount);
    }
}
