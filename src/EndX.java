/*
Given a string, compute recursively a new string where all the lowercase 'x' chars have been moved to the end of the string.

endX("xxre") → "rexx"
endX("xxhixx") → "hixxxx"
endX("xhixhix") → "hihixxx"
 */
public class EndX {
    public static void main(String[] args) {
        System.out.println(endX("xxre"));
        System.out.println(endX("xxhixx"));
        System.out.println(endX("xhixhix"));
        System.out.println(endX("axaxax"));
    }

    static String endX(String s) {
        // N.B since recursively traverse from left to right, I call it pointer "i" as appropriate
        return endX(s, 0);
    }

    /**
     * Returns a new string with all 'x' chars moved to the end.
     * Note: Uses Left->Right recursive traversal to make manipulation easier.
     *
     * @param s string
     * @param i pointer i
     * @return new string with all 'x' moved to end
     */
    static String endX(String s, int i) {
        //BC: If empty string, nothing to move
        if (i >= s.length())
            return "";
        //RC1: If ith char = 'x', then it must go at the end; recur rest and append an 'x'
        if (s.charAt(i) == 'x')
            return endX(s, i + 1) + 'x';
        else
            //RC2: If ith char != x, then retain current order; concat with result from recurring on rest
            return s.charAt(i) + endX(s, i + 1);
    }
}
