/*
We'll say that a "pair" in a string is two instances of a char separated by a char.
So "AxA" the A's make a pair. Pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x.
Recursively compute the number of pairs in the given string.

countPairs("axa") → 1
countPairs("axax") → 2
countPairs("axbx") → 1
 */
public class CountPairs {
    public static void main(String[] args) {
        System.out.println(countPairs("axa"));
        System.out.println(countPairs("axax"));
        System.out.println(countPairs("axbx"));
        System.out.println(countPairs("ihihhh")); // should be 3
    }

    static int countPairs(String s) {
        return countPairs(s, s.length() - 1);
    }

    static int countPairs(String s, int n) {
        //BC: If len < 3, no pairs can exist
        if (n < 2)
            return 0;
        //RC1: If current char, s[n], is part of a pair, add 1 and recurse to s[n-1]
        if (s.charAt(n - 2) == s.charAt(n))
            return 1 + countPairs(s, n - 1);
        else
            //RC2: If not, recurse to s[n-1]
            return countPairs(s, n - 1);
    }
}
