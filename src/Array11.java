/*
Given an array of ints, compute recursively the number of times that the value 11 appears in the array.

array11([1, 2, 11]) → 1
array11([11, 11]) → 2
array11([1, 2, 3, 4]) → 0
 */
public class Array11 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 11};
        int[] a2 = {11, 11};
        int[] a3 = {1, 2, 3, 4};
        System.out.println(array11(a1));
        System.out.println(array11(a2));
        System.out.println(array11(a3));

    }

    static int array11(int[] a) {
        return array11(a, a.length - 1);
    }

    static int array11(int[] a, int n) {
        // BC1: Index out of bounds/empty array doesn't contain a 11
        if (n < 0)
            return 0;
        // RC1: If current elem = 11, then add 1 and recur rest
        if (a[n] == 11)
            return 1 + array11(a, n - 1);
        else
            // RC2: If current elem is not 11, check remaining by recurring rest
            return array11(a, n - 1);
    }
}
