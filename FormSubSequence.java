public class FormSubSequence {
    public static boolean CheckSubSequence(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int count = 0;

        for (int index = 0; index < n1; index++) {
            int i = index;
            int j = 0;

            while (i < n1 && j < n2) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    j++;
                }
                i++;
            }

            if (j == n2) {   // full s2 matched
                count++;
                if (count == 2) return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(CheckSubSequence("aabba", "aba")); // Expected: true
        System.out.println(CheckSubSequence("abcabc", "abc")); // true
        System.out.println(CheckSubSequence("abcdef", "ace")); // false
    }
}
