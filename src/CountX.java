/*
Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

countX("xxhixx") → 4
countX("xhixhix") → 3
countX("hi") → 0
 */
public class CountX {
    public static void main(String[] args) {
        System.out.println(countX("xxhixx"));
        System.out.println(countX("xhixhix"));
        System.out.println(countX("hi"));
    }

    static int countX(String s) {
        return countX(s, s.length() - 1);
    }

    /**
     * This function takes in a string s with length n (index-based) and returns the total number of
     * occurrences of the character "x" in the string.
     *
     * @param s string s
     * @param n length of string (index-based)
     * @return number of x's
     */
    private static int countX(String s, int n) {
        // BC1: if empty string, no X's exist
        if (n < 0)
            return 0;
        // RC1: if last char is an "x", add 1 and recurse
        if (s.charAt(n) == 'x')
            return 1 + countX(s, n - 1);
            // RC2: if last char not an "x" simply recurse
        else
            return countX(s, n - 1);
    }
}
