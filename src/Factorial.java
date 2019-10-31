public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(3));
    }

    static int fact(int n) {
        // BC: N == 0
        if (n == 0)
            return 1;
        else
            return n * fact(n - 1);
    }
}
