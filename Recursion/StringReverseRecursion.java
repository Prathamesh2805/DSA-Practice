package Recursion;

public class StringReverseRecursion {
    // Note: The 'str' field here isn't used by your static method

    public static String reverseString(String str) {
        // Base case: correctly stops when string is short enough
        if (str == null || str.length() <= 1) {
            return str;
        }
        // Correct recursive step: calls recursion on a SHORTER string
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Hello")); // Output: olleH
    }
}
