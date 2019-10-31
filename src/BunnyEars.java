/*
We have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).

bunnyEars(0) → 0
bunnyEars(1) → 2
bunnyEars(2) → 4
 */
public class BunnyEars {
    public static void main(String[] args) {
        System.out.println(countEars(2));
        System.out.println(countEars(8));

    }

    static int countEars(int bunnies) {
        // BC: 0 bunnies = 0 ears
        if (bunnies == 0)
            return 0;
        // RC: 2 for current bunny plus recurse
        return 2 + countEars(bunnies - 1);

    }
}
