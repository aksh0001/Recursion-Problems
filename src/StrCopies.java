/*
Given a string and a non-empty substring sub, compute recursively if at least k copies of sub appear in the string
somewhere, possibly with overlapping. k will be non-negative.

strCopies("catcowcat", "cat", 2) → true
strCopies("catcowcat", "cow", 2) → false
strCopies("catcowcat", "cow", 1) → true
 */
public class StrCopies {
    public static void main(String[] args) {
        System.out.println(strCopies("catcowcat", "cat", 2));
        System.out.println(strCopies("catcowcat", "cow", 2));
        System.out.println(strCopies("catcowcat", "cow", 1));
    }

    static boolean strCopies(String str, String sub, int k) {
        return strCopies(str, sub, k, str.length() - 1, sub.length() - 1);
    }

    static boolean strCopies(String s, String sub, int k, int n, int m) {
        //BC1: If k = 0, by definition atleast 0 copies appear (N.B. this BC needs to come first since this statement takes precedence over length mismatches)
        if (k == 0)
            return true;
        //BC2: If len < sub len, cannot match
        if (n < m)
            return false;
        //RC1: If last substring group (s[n-m:n+1]) matches sub, then decrease k since we found a match and recurse to s[n-1]
        if (s.substring(n - m, n + 1).equals(sub))
            return strCopies(s, sub, k - 1, n - 1, m); // recur to s[n-1] since OVERLAPS are allowed
        else //RC2: If not match, then recurse to s[n-1]
            return strCopies(s, sub, k, n - 1, m);
    }


}
