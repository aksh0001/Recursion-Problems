/*
Given base and n that are both 1 or more, compute recursively (no loops) the value of base to the n power.

powerN(3, 1) → 3
powerN(3, 2) → 9
powerN(3, 3) → 27

FOLLOW-UP: IMPROVE RUNTIME COMPLEXITY
 */
public class PowerN {
    public static void main(String[] args) {
        System.out.println(powerN(3, 3));
        System.out.println(fastPowerN(9, 3));

    }

    /**
     * Returns b^n.
     *
     * @param b base
     * @param n exponent
     * @return b^n
     * @Time: O(N)
     * @Space: O(N)
     */
    static int powerN(int b, int n) {
        // BC: b^0 = 1
        if (n == 0)
            return 1;
        // RC: b^n = b * b^(n-1)
        return b * powerN(b, n - 1);

    }

    /**
     * Computes b^n in log time.
     *
     * @param b base
     * @param n exponent
     * @return b^n
     * @Time: O(log ( n))
     * @Space: O(log ( n))
     */
    static int fastPowerN(int b, int n) {
        // BC: b^0 = 1
        if (n == 0)
            return 1;
        // RC1: if n is even, b^n = (b^2)^(n/2)
        if (n % 2 == 0)
            return fastPowerN(b * b, n / 2);
        else
            // RC2: If n is odd, b^n = (b^2)^(n/2)*b
            return fastPowerN(b * b, n / 2) * b;

    }
}
