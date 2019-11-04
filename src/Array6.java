/*
Given an array of ints, compute recursively if the array contains a 6.

array6([1, 6, 4]) → true
array6([1, 4]) → false
array6([6]) → true
 */
public class Array6 {
    public static void main(String[] args) {
        int[] a1 = {1, 6, 4};
        System.out.println(array6(a1));
        int[] a2 = {1, 4};
        System.out.println(array6(a2));
        int[] a3 = {6};
        System.out.println(array6(a3));

    }

    static boolean array6(int[] a) {
        return array6(a, a.length - 1);
    }

    static boolean array6(int[] a, int n) {
        // BC1: Index out of bounds/empty array doesn't contain a 6
        if (n < 0)
            return false;
        // BC2: If current elem is a 6, then return true to mark found
        if (a[n] == 6)
            return true;
        // RC: If current elem is not 6, check other elements by recurring on rest
        return array6(a, n - 1);
    }
}
