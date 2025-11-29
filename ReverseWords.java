public class ReverseWords {

    public static String ReverseString(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (i < n) {

            // Skip leading spaces
            while (i < n && s.charAt(i) == ' ') {
                i++;
            }

            if (i >= n) break; // no more words

            int start = i;

            // Move till next space
            while (i < n && s.charAt(i) != ' ') {
                i++;
            }

            int end = i - 1;

            // Reverse the word
            while (end >= start) {
                sb.append(s.charAt(end));
                end--;
            }

            // Only add space if more words exist
            if (i < n) sb.append(' ');
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "hello world this is java";
        String output = ReverseString(input);

        System.out.println("Original : " + input);
        System.out.println("Reversed : " + output);
    }
}
