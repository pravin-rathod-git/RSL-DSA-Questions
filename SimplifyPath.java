import java.util.*;

public class SimplifyPath {

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();

        // Split by slash
        String[] parts = path.split("/");

        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                // Skip empty or current directory
                continue;
            } else if (part.equals("..")) {
                // Parent directory: pop if possible
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                // Valid directory or file name (like "...", "a", "folder")
                stack.push(part);
            }
        }

        // Build canonical path
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }

        // If stack empty → root "/"
        return result.length() == 0 ? "/" : result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Unix path: ");
        String inputPath = sc.nextLine();

        String simplified = simplifyPath(inputPath);
        System.out.println("Simplified Path: " + simplified);
    }
}
