/*
Given a string, compute recursively a new string where all the adjacent chars are now separated by a "*".

allStar("hello") → "h*e*l*l*o"
allStar("abc") → "a*b*c"
allStar("ab") → "a*b"
 */
public class AllStar {
    public static void main(String[] args) {
        System.out.println(allStar("hello"));
        System.out.println(allStar("abc"));
        System.out.println(allStar("ab"));
        System.out.println(allStar("a"));
    }

    static String allStar(String s) {
        return allStar(s, s.length() - 1);
    }

    static String allStar(String s, int n) {
        // BC: If len smaller than 2, return as is since can't separate
        if (n < 1)
            return s.substring(0, n + 1);
        // RC: Recur on rest + concat "*" + concat current character
        return allStar(s, n - 1) + "*" + s.charAt(n);
    }
}
