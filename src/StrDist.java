/*
Given a string and a non-empty substring sub, compute recursively the largest substring which starts and ends
with sub and return its length.

strDist("catcowcat", "cat") → 9
strDist("catcowcat", "cow") → 3
strDist("cccatcowcatxx", "cat") → 9
 */
public class StrDist {
    public static void main(String[] args) {
        System.out.println(strDist("catcowcat", "cat"));
        System.out.println(strDist("catcowcat", "cow"));
        System.out.println(strDist("cccatcowcatxx", "cat"));
    }

    static int strDist(String str, String sub) {
        return strDist(str, sub, 0, str.length() - 1, sub.length() - 1);
    }

    static int strDist(String s, String sub, int i, int j, int m) {
        //BC: Since we need atleast one pair, len(s) must be greater than m; if not, cannot match
        if (j - i < m)
            return 0;
        //RC1: If left pointer's substring group doesn't match sub, recur to s[i+1] to look at rest
        if (!s.substring(i, i + m + 1).equals(sub))
            return strDist(s, sub, i + 1, j, m);
        //RC2: If right pointer's substring group doesn't match sub, recur to s[j-1] to look a rest
        if (!s.substring(j - m, j + 1).equals(sub))
            return strDist(s, sub, i, j - 1, m);
        else
            // LR pointer both match a sub, return the length of this substring
            return (j - i) + 1;
    }
}
