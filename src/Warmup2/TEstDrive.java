package Warmup2;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 7/8/13
 * Time: 3:47 PM
 */
public class TestDrive {

    public static void main(String[] args) {

        Warmup2 test = new Warmup2();

        System.out.println(test.stringTimes("Abc", 2));
        System.out.println(test.frontTimes("Abc", 2));
        System.out.println(test.countXX("abcxx"));
        System.out.println(test.doubleX("axxbb"));
        System.out.println(test.doubleX2("axxbb"));
        System.out.println(test.stringBits("Hello"));
        System.out.println(test.stringSplosion("Code"));
        System.out.println(test.last2("xaxxaxaxx"));
        System.out.println(test.arrayCount9(new int[]{1, 9, 9, 3, 9}));
        System.out.println(test.arrayFront9(new int[]{1, 2, 9, 3, 4}));
        System.out.println(test.array123(new int[]{1, 1, 2, 1, 2, 3}));
        System.out.println(test.stringMatch("abc", "abc"));
        System.out.println(test.stringX("xx"));
        System.out.println(test.altPairs("kitten"));
        System.out.println(test.stringYak("yakxxxyak"));
        System.out.println(test.array667(new int[]{6, 6, 2, 6}));
        System.out.println(test.noTriples(new int[]{1, 1, 1, 2, 2, 2, 1}));
        System.out.println(test.has271(new int[]{2, 7, 3}));

    }

}
