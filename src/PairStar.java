/*
Given a string, compute recursively a new string where identical chars that are adjacent in the original string
are separated from each other by a "*".

pairStar("hello") → "hel*lo"
pairStar("xxyy") → "x*xy*y"
pairStar("aaaa") → "a*a*a*a"
 */
public class PairStar {
    public static void main(String[] args) {
        System.out.println(pairStar("hello"));
        System.out.println(pairStar("xxyy"));
        System.out.println(pairStar(pairStar("aaaa")));
        System.out.println(pairStar("abcd"));
        System.out.println(pairStar("llaaa"));
    }

    static String pairStar(String s) {
        return pairStar(s, s.length() - 1);
    }

    static String pairStar(String s, int n) {
        // BC: If len smaller than 2, return as is since can't separate
        if (n < 1)
            return s.substring(0, n + 1);
        // RC1: If last two chars are equal, recur on rest + concat with "*" + concat current char
        if (s.charAt(n - 1) == s.charAt(n))
            return pairStar(s, n - 1) + "*" + s.charAt(n);

        else // RC2: If not identical, recur rest + concat with current char
            return pairStar(s, n - 1) + s.charAt(n);
    }
}
