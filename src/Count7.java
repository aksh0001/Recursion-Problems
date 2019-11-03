/*
Given a non-negative int n, return the count of the occurrences of 7 as a digit
count7(717) → 2
count7(7) → 1
count7(123) → 0
 */
public class Count7 {
    public static void main(String[] args) {
        System.out.println(count7(717));
        System.out.println(count7(7));
        System.out.println(count7(148));

    }

    static int count7(int n) {
        // BC: if n is 0, no 7s exist
        if (n == 0)
            return 0;
        // RC1: If rightmost is 7, add 1 and recurse on rest
        if (n % 10 == 7)
            return 1 + count7(n / 10);
            // RC2: If rightmost not 7, recurse on rest
        else
            return count7(n / 10);
    }
}
