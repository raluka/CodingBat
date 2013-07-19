package Logic2;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 7/17/13
 * Time: 6:44 PM
 * CodingBat.com - Logic -2
 */
public class Logic2 {

    /*
    We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and big
    bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks. This is
    a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks

makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true
     */

    public boolean makeBricks(int small, int big, int goal) {
        return goal <= big * 5 + small && goal % 5 <= small;
    }

    /*
    Given 3 int values, a b c, return their sum. However, if one of the values is the same as another of the values,
    it does not count towards the sum.

loneSum(1, 2, 3) → 6
loneSum(3, 2, 3) → 2
loneSum(3, 3, 3) → 0
     */

    public int loneSum(int a, int b, int c) {
        if (a == b && b == c) a = b = c = 0;
        if (a == b) a = b = 0;
        if (a == c) a = c = 0;
        if (b == c) b = c = 0;
        return a + b + c;
    }

    public int loneSum1(int a, int b, int c) {
        int sum = 0;
        if (a != b && a != c) sum += a;
        if (b != a && b != c) sum += b;
        if (c != a && c != b) sum += c;
        return sum;
    }

    /*
    Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the
     sum and values to its right do not count. So for example, if b is 13, then both b and c do not count.

luckySum(1, 2, 3) → 6
luckySum(1, 2, 13) → 3
luckySum(1, 13, 3) → 1
     */

    public int luckySum(int a, int b, int c) {
        if (a == 13) a = b = c = 0;
        if (b == 13) b = c = 0;
        if (c == 13) c = 0;
        return a + b + c;
    }

    /*
    Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19
    inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper
    "public int fixTeen(int n) {"that takes in an int value and returns that value fixed for the teen rule. In this
    way, you avoid repeating the teen code 3 times (i.e. "decomposition"). Define the helper below and at the same
    indent level as the main noTeenSum().

noTeenSum(1, 2, 3) → 6
noTeenSum(2, 13, 1) → 3
noTeenSum(2, 1, 14) → 3
     */

    public int noTeenSum(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    public int fixTeen(int n) {
        if (n < 13 || n > 19 || n == 15 || n == 16) return n;
        else return 0;
    }

    /*
    For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15
    rounds up to 20. Alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so
    12 rounds down to 10. Given 3 ints, a b c, return the sum of their rounded values. To avoid code repetition, write
    a separate helper "public int round10(int num) {" and call it 3 times. Write the helper entirely below and at the
    same indent level as roundSum().

roundSum(16, 17, 18) → 60
roundSum(12, 13, 14) → 30
roundSum(6, 4, 4) → 10
     */

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num) {
        if (num % 10 < 5) return num - num % 10;
        return (num + 10) - num % 10;
    }

    /*
    Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1), while the other
    is "far", differing from both other values by 2 or more. Note: Math.abs(num) computes the absolute value of a
    number.

closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true
     */

    public boolean closeFar(int a, int b, int c) {
        int x = Math.abs(a - b);
        int y = Math.abs(a - c);
        int z = Math.abs(b - c);
        return x <= 1 && y >= 2 && z >= 2 || y <= 1 && x >= 2 && z >= 2 || z <= 1 && x >= 2 && y >= 2;
    }

    /*
    Given 2 int values greater than 0, return whichever value is nearest to 21 without going over. Return 0 if they both
     go over.

blackjack(19, 21) → 21
blackjack(21, 19) → 21
blackjack(19, 22) → 19
     */

    public int blackjack(int a, int b) {
        if (a > 21) a = 0;
        if (b > 21) b = 0;
        return Math.max(a, b);
    }

    /*
    Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are
    evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
     */

    /*  Complicated method :D
     public boolean evenlySpaced(int a, int b, int c) {
          return (maxThree(a, b, c) - middleThree(a, b, c)) == (middleThree(a, b, c) - minThree(a, b, c));
      }

      public int maxThree(int a, int b, int c) {
          return (Math.max(Math.max(a, b), c));
      }

      public int minThree(int a, int b, int c) {
          return Math.min(Math.min(a, b), c);
      }

      public int middleThree(int a, int b, int c) {
          return a + b + c - maxThree(a, b, c) - minThree(a, b, c);
      }
    */

    public boolean evenlySpaced(int a, int b, int c) {
        int maxThree = Math.max(Math.max(a, b), c);
        int minThree = Math.min(Math.min(a, b), c);
        int middleThree = a + b + c - minThree - maxThree;
        return (maxThree - middleThree == middleThree - minThree);
    }

    /*
    We want make a package of goal kilos of chocolate. We have small bars (1 kilo each) and big bars (5 kilos each).
    Return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't
    be done.

makeChocolate(4, 1, 9) → 4
makeChocolate(4, 1, 10) → -1
makeChocolate(4, 1, 7) → 2
     */

    public int makeChocolate(int small, int big, int goal) {
        if (big > goal / 5) big = goal / 5;
        if (goal > big * 5 + small) return -1;
        if (goal % 5 > small) return -1;
        return goal - big * 5;
    }
}
