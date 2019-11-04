/*
Given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10.
array220([1, 2, 20]) → true
array220([3, 30]) → true
array220([3]) → false
 */
public class Array220 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 20};
        int[] a2 = {3, 30};
        int[] a3 = {3};
        System.out.println(array220(a1));
        System.out.println(array220(a2));
        System.out.println(array220(a3));
    }

    static boolean array220(int[] a) {
        return array220(a, a.length - 1, Integer.MAX_VALUE);
    }

    /**
     * Solves the very confusingly stated problem.
     *
     * @param a       array
     * @param n       length of array index-based
     * @param lookFor an element to look for
     * @return if match condition
     */
    static boolean array220(int[] a, int n, float lookFor) {
        // BC1: If empty, cannot meet criteria
        if (n < 0)
            return false;
        // BC2: If current element is the element to look for, then matched criteria
        if (a[n] == lookFor)
            return true;
        // RC: recur on rest and update element to look for to a[n]/10
        return array220(a, n - 1, (float) a[n] / 10);
    }

}


