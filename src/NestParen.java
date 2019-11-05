/*
Given a string, return true if it is a nesting of zero or more pairs of parenthesis, like "(())" or "((()))".
Suggestion: check the first and last chars, and then recur on what's inside them.

nestParen("(())") → true
nestParen("((()))") → true
nestParen("(((x))") → false
 */
public class NestParen {
    public static void main(String[] args) {
        System.out.println(nestParen("(())"));
        System.out.println(nestParen("((()))"));
        System.out.println(nestParen("(((x))"));
    }

    static boolean nestParen(String str) {
        return nestParen(str, 0, str.length() - 1);
    }


    static boolean nestParen(String s, int i, int j) {
        //BC: If empty, then it is a valid nesting
        if (i > j)
            return true;
        //RC1: If first and last pair of parens make a valid pair, check middle by recurring to middle
        if (s.charAt(i) == '(' && s.charAt(j) == ')')
            return nestParen(s, i + 1, j - 1); // check middle
        else
            return false; // if not, return false

    }
}
