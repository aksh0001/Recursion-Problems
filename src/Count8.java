/*
Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
except that an 8 with another 8 immediately to its left counts double, so 8818 yields 4.
count8(8) → 1
count8(818) → 2
count8(8818) → 4
 */
public class Count8 {
    public static void main(String[] args) {
        System.out.println(count8(8));
        System.out.println(count8(818));
        System.out.println(count8(123));
        System.out.println(count8(8818));

    }

    static int count8(int n) {
        // BC: if n is 0, no 8s exist
        if (n == 0)
            return 0;
        if (n % 10 == 8) {
            // RC1: if two rightmost digits is 88, count as 2, and recurse on rest
            if (n % 100 == 88)
                return 2 + count8(n / 10);
            else
                // RC2: if rightmost digit is just one 8, standard--count as 1 and recurse on rest
                return 1 + count8(n / 10);
        } else
            // RC3: if rightmost not 8, recurse on rest
            return count8(n / 10);
    }
}
