/*
Given a string, compute recursively the number of times lowercase "hi" appears in the string, however do not count "hi" that have an 'x' immedately before them.

countHi2("ahixhi") → 1
countHi2("ahibhi") → 2
countHi2("xhixhi") → 0
 */
public class CountHi2 {
    public static void main(String[] args) {
        System.out.println(countHi2("ahixhi"));
        System.out.println(countHi2("ahibhi"));
        System.out.println(countHi2("xhixhi"));
    }

    static int countHi2(String str) {
        return countHi2(str, str.length() - 1);
    }

    static int countHi2(String s, int n) {
        //BC: if len < 2, cannot match
        if (n < 1)
            return 0;

        //RC1: If last two is "hi", add one and recur to s[n-2] (but ensure its left is not "x")
        //N.B. if n = 1, which indicates just "hi", we count it.
        if (s.substring(n - 1, n + 1).equals("hi") && (n >= 2 && s.charAt(n - 2) != 'x' || n == 1))
            return 1 + countHi2(s, n - 2);
        else
            //RC2: If not recur to s[n-1]
            return countHi2(s, n - 1);
    }

}
