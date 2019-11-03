/*
Given a string, compute recursively (no loops) a new string where all the lowercase 'x' chars have been changed to 'y' chars.

changeXY("codex") → "codey"
changeXY("xxhixx") → "yyhiyy"
changeXY("xhixhix") → "yhiyhiy"
 */
public class ChangeXY {
    public static void main(String[] args) {
        System.out.println(changeXY("codex"));
        System.out.println(changeXY("xxhixx"));
        System.out.println(changeXY("xhixx"));
    }

    static String changeXY(String s) {
        return changeXY(s, s.length() - 1);
    }

    static String changeXY(String s, int n) {
        // BC1: If empty string, nothing to change
        if (n < 0)
            return "";
        // RC1: If last char is x, recurse on rest and concatenate with "y"
        if (s.charAt(n) == 'x')
            return changeXY(s, n - 1) + "y";
            // RC2: If last char not x, recurse on rest and keep current character
        else
            return changeXY(s, n - 1) + s.charAt(n);
    }
}
