/*
Given a string and a non-empty substring sub, compute recursively the number of times that sub appears in the string,
without the sub strings overlapping.

strCount("catcowcat", "cat") → 2
strCount("catcowcat", "cow") → 1
strCount("catcowcat", "dog") → 0
 */
public class StrCount {
    public static void main(String[] args) {
        System.out.println(strCount("catcowcat", "cat"));
        System.out.println(strCount("catcowcat", "cow"));
        System.out.println(strCount("catcowcat", "dog"));
    }

    static int strCount(String str, String sub) {
        return strCount(str, sub, str.length() - 1, sub.length() - 1);
    }

    static int strCount(String s, String sub, int n, int m) {
        //BC: If len < sub len, cannot match
        if (n < m)
            return 0;
        //RC1: If last substring group (s[n-m:n+1]) matches sub, then add 1 and recurse to s[n-m-1] to check rest
        if (s.substring(n - m, n + 1).equals(sub))
            return 1 + strCount(s, sub, n - m - 1, m);
        else //RC2: If not match, then recurse to s[n-1]
            return strCount(s, sub, n - 1, m);
    }

}
