/*
Given a string that contains a single pair of parenthesis, compute recursively a new string made of only of the parenthesis and their contents, so "xyz(abc)123" yields "(abc)".

parenBit("xyz(abc)123") → "(abc)"
parenBit("x(hello)") → "(hello)"
parenBit("(xy)1") → "(xy)"
 */
public class ParenBit {
    public static void main(String[] args) {
        System.out.println(parenBit("xyz(abc)123"));
        System.out.println(parenBit("x(hello)"));
        System.out.println(parenBit("(xy)1"));
        System.out.println(parenBit("xyz"));
        System.out.println(parenBit("()"));
        System.out.println(parenBit(""));
    }

    static String parenBit(String str) {
        return parenBit(str, 0, str.length() - 1);
    }

    /**
     * L-R (Left, Right) Recursive pattern approach.
     * parenBit(s, i, j) returns the paren bit of s bounded at [i:j].
     * Therefore, if s[i] = '(' and s[j] = ')' we can return this substring; otherwise recurse left/right appropriately.
     *
     * @param s string
     * @param i left pointer
     * @param j right pointer
     * @return the paren bit
     */
    static String parenBit(String s, int i, int j) {
        //BC1: If empty string/pointers overlap, nothing to return
        if (i > j)
            return "";
        //RC1: If s[i] is not an open paren '(', then recurse right to exclude this s[i]
        if (s.charAt(i) != '(')
            return parenBit(s, i + 1, j);
        //RC2: If s[j] is not a closed paren ')', then recurse left to exclude this s[j]
        if (s.charAt(j) != ')')
            return parenBit(s, i, j - 1);
        else    //Else, pointers i and j are at the open and closed paren, return this substring
            return s.substring(i, j + 1);
    }

}
