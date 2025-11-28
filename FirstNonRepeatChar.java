public class FirstNonRepeatChar {

    public static char NonRepeat(String s) {
        int n = s.length();
        int[] freq = new int[256];

        // Count frequency of each character
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            freq[c]++;
        }

        // Find first character with frequency 1
        for (char c : s.toCharArray()) {
            if (freq[c] == 1) {
                return c;
            }
        }

        return '\0';  // means no non-repeating character found
    }

    public static void main(String[] args) {
        String s = "aabbccdeef";
        char result = NonRepeat(s);

        if (result == '\0')
            System.out.println("No non-repeating character");
        else
            System.out.println("First non-repeating character: " + result);
    }
}
