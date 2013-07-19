package Logic2;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 7/17/13
 * Time: 6:43 PM
 * CodingBat.com - Test class for Logic -2
 */
public class TestLogic2 {
    public static void main(String[] args) {

        Logic2 tester = new Logic2();

        System.out.println(tester.makeBricks(3, 1, 8));
        System.out.println(tester.makeBricks(3, 1, 9));
        System.out.println(tester.makeBricks(3, 2, 10));
        System.out.println(tester.loneSum(1, 2, 3));
        System.out.println(tester.loneSum(3, 2, 3));
        System.out.println(tester.loneSum(3, 3, 3));
        System.out.println(tester.loneSum1(1, 2, 3));
        System.out.println(tester.loneSum1(3, 2, 3));
        System.out.println(tester.loneSum1(3, 3, 3));
        System.out.println(tester.luckySum(1, 2, 3));
        System.out.println(tester.luckySum(1, 2, 13));
        System.out.println(tester.luckySum(1, 13, 3));
        System.out.println(tester.noTeenSum(1, 2, 3));
        System.out.println(tester.noTeenSum(2, 13, 1));
        System.out.println(tester.noTeenSum(2, 1, 14));
        System.out.println(tester.round10(12));
        System.out.println(tester.round10(15));
        System.out.println(tester.roundSum(6, 4, 4));
        System.out.println(tester.roundSum(12, 13, 14));
        System.out.println(tester.roundSum(16, 17, 18));
        System.out.println(tester.closeFar(1, 2, 10));
        System.out.println(tester.closeFar(1, 2, 3));
        System.out.println(tester.closeFar(4, 1, 3));
        System.out.println(tester.blackjack(19, 21));
        System.out.println(tester.blackjack(21, 19));
        System.out.println(tester.blackjack(19, 22));
        System.out.println(tester.evenlySpaced(2, 4, 6));
        System.out.println(tester.evenlySpaced(4, 6, 2));
        System.out.println(tester.evenlySpaced(4, 6, 3));
        System.out.println(tester.makeChocolate(4, 1, 9));
        System.out.println(tester.makeChocolate(4, 1, 10));
        System.out.println(tester.makeChocolate(4, 1, 7));
    }
}
