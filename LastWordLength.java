public class LastWordLength {
    public static int lengthOfLastWord(String s) {
        int n = s.length();
        int i = n - 1;

        // Skip trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        int j = i;

        // Count the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            i--;
        }

        return j - i;
    }

    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        System.out.println("Length of last word: " + lengthOfLastWord(s1)); // 5
        System.out.println("Length of last word: " + lengthOfLastWord(s2)); // 4
        System.out.println("Length of last word: " + lengthOfLastWord(s3)); // 6
    }
}
