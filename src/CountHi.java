/*
Given a string, compute recursively (no loops) the number of times lowercase "hi" appears in the string.

countHi("xxhixx") → 1
countHi("xhixhix") → 2
countHi("hi") → 1
 */
public class CountHi {
    public static void main(String[] args) {
        System.out.println(countHi("xxhixx"));
        System.out.println(countHi("xhixhix"));
        System.out.println(countHi("hi"));
        System.out.println(countHi("xhihi"));
    }

    static int countHi(String s) {
        return countHi(s, s.length() - 1);
    }

    static int countHi(String s, int n) {
        // BC1: if string length less than 2, no "hi" exists
        if (n < 1)
            return 0;
        // RC1: if last 2 chars is "hi", add 1 and recurse
        if (s.substring(n - 1, n + 1).equals("hi"))
            return 1 + countHi(s, n - 2);
            // RC2: if last two not "hi" simply recurse
        else
            return countHi(s, n - 1);
    }
}
