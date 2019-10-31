public class Fib {
    public static void main(String[] args) {
        System.out.println(fib(7));

    }

    static int fib(int n) {
        // BC1: n = 0 fib(n) = 0
        if (n == 0)
            return 0;
        // BC2: n == 1 fib(1) = 1
        if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
