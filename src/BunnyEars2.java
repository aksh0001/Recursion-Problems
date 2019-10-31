/*
We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot. Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

bunnyEars2(0) → 0
bunnyEars2(1) → 2
bunnyEars2(2) → 5
 */
public class BunnyEars2 {
    public static void main(String[] args) {
        System.out.println(countEars(2));

    }

    static int countEars(int bunnies) {
        // BC: 0 bunnies = 0 ears
        if (bunnies == 0)
            return 0;
        // RC: if curr bunny is even use 3, else use 2, then recurse 'n add
        return (bunnies % 2 == 0) ? 3 + countEars(bunnies - 1) : 2 + countEars(bunnies - 1);
    }
}
