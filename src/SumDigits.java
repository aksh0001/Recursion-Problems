/*
Given a non-negative int n, return the sum of its digits recursively (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

sumDigits(126) → 9
sumDigits(49) → 13
sumDigits(12) → 3
 */

public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(16));
        System.out.println(sumDigits(59));

    }

    static int sumDigits(int n) {
        // BC: if n is a single digit return n itself
        if (n >= 0 && n <= 9)
            return n;
        // RC: Use the rightmost digit (n%10) and recurse on rest, sumDigits(n/10), and add together
        return n % 10 + sumDigits(n / 10);
    }
}
