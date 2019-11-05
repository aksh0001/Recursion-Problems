/*
Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

countAbc("abc") → 1
countAbc("abcxxabc") → 2
countAbc("abaxxaba") → 2
 */
public class CountAbc {
    public static void main(String[] args) {
        System.out.println(countAbc("abc"));
        System.out.println(countAbc("abcxxabc"));
        System.out.println(countAbc("abaxxaba"));
        System.out.println(countAbc("ababc")); // 2
    }

    static int countAbc(String s) {
        return countAbc(s, s.length() - 1);
    }

    static int countAbc(String s, int n) {
        //BC: if len < 3, cannot match "abc" or "aba"
        if (n < 2)
            return 0;
        //RC1: If last group of three match "abc" or "aba", add 1 and recurse to s[n-1]
        if (s.substring(n - 2, n + 1).equals("abc") || s.substring(n - 2, n + 1).equals("aba"))
            return 1 + countAbc(s, n - 1);
        else
            //RC2: If not recurse to s[n-1] and return
            return countAbc(s, n - 1);
    }
}
