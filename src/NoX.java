/*
Given a string, compute recursively a new string where all the 'x' chars have been removed.

noX("xaxb") → "ab"
noX("abc") → "abc"
noX("xx") → ""
 */
public class NoX {
    public static void main(String[] args) {
        System.out.println(noX("xaxb"));
        System.out.println(noX("abc"));
        System.out.println(noX("xx"));
    }

    static String noX(String s) {
        return noX(s, s.length() - 1);
    }

    static String noX(String s, int n) {
        // BC: If empty string, nothing to remove
        if (n < 0)
            return "";
        //RC1: If current char, s[n], = "x" recurse on rest and return to indicate we exclude this character
        if (s.charAt(n) == 'x')
            return noX(s, n - 1);
            // RC2: if current char is not "x", recurse on rest and concat with (keep) current
        else
            return noX(s, n - 1) + s.charAt(n);
    }


}
