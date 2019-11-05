/*
Given a string, return recursively a "cleaned" string where adjacent chars that are the same have been reduced to a single char. So "yyzzza" yields "yza".

stringClean("yyzzza") → "yza"
stringClean("abbbcdd") → "abcd"
stringClean("Hello") → "Helo"
 */
public class StrClean {
    public static void main(String[] args) {
        System.out.println(strClean("yyzzza"));
        System.out.println(strClean("abbbcdd"));
        System.out.println(strClean("Hello"));
    }

    static String strClean(String s) {
        return strClean(s, s.length() - 1);
    }

    static String strClean(String s, int n) {
        //BC: empty string and len = 1 doesn't need to be cleaned
        if (n < 1)
            return s.substring(0, n + 1);
        //RC1: if last two chars are same, recur to s[n-1] and return to exclude the current char, s[n]
        if (s.charAt(n - 1) == s.charAt(n))
            return strClean(s, n - 1);
        else
            //RC2: if not the same retain the char by recursively cleaning s[n-1] + concat with s[n]
            return strClean(s, n - 1) + s.charAt(n);
    }

    static String strCleanAlt(String s, int n) {
        //BC: empty string and len = 1 doesn't need to be cleaned
        if (n < 1)
            return s.substring(0, n + 1);
        // ALTERNATE PATTERN: RECURSIVELY CLEAN s[n-1]
        String lower_cleaned = strCleanAlt(s, n - 1);
        // If the last element of the cleaned string is the same as current, don't include the current (return as is)
        if (lower_cleaned.charAt(lower_cleaned.length() - 1) == s.charAt(n))
            return lower_cleaned;

        else // If not the same, retain current (concat with s[n])
            return lower_cleaned + s.charAt(n);
    }
}
