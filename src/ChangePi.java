/*
Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".

changePi("xpix") → "x3.14x"
changePi("pipi") → "3.143.14"
changePi("pip") → "3.14p"
 */
public class ChangePi {
    public static void main(String[] args) {
        System.out.println(changePi("xpix"));
        System.out.println(changePi("pipi"));
        System.out.println(changePi("pip"));

    }

    static String changePi(String s) {
        return changePi(s, s.length() - 1);
    }

    static String changePi(String s, int n) {
        // BC1: If len is less than 2, then "pi" cannot exist in the string, return as is
        if (n < 1)
            return s.substring(0, n + 1);
        // RC1: if last two chars is "pi", recurse on rest and concat with "3.14:
        if (s.substring(n - 1, n + 1).equals("pi"))
            return changePi(s, n - 2) + "3.14";
            // RC2: if last two chars not "pi", recurse on rest and concat with (keep) current
        else
            return changePi(s, n - 1) + s.charAt(n);
    }
}
