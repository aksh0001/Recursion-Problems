/*
Given a string, compute recursively (no loops) the number of "11" substrings in the string.
The "11" substrings should not overlap.

count11("11abc11") → 2
count11("abc11x11x11") → 3
count11("111") → 1
 */
public class Count11 {
    public static void main(String[] args) {
        System.out.println(count11("11abc11"));
        System.out.println(count11("abc11x11x11"));
        System.out.println(count11("111"));
    }

    static int count11(String s) {
        return count11(s, s.length() - 1);
    }

    static int count11(String s, int n) {
        //BC: if len < 2, cannot match "11"
        if (n < 1)
            return 0;
        //RC1: if last group of 2 matches "11", add 1 and recurse to s[n-2] (NOTE the n-2 since we cant overlap)
        if (s.substring(n - 1, n + 1).equals("11"))
            return 1 + count11(s, n - 2);
        else
            //RC2: if not match, recur to s[n-1] to check the rest
            return count11(s, n - 1);
    }
}
