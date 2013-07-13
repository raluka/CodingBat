package Array1;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 7/12/13
 * Time: 4:17 PM
 */
public class TestArray1 {
    public static void main(String[] args) {

        Array1 a = new Array1();
        // int[] b = new int[3];




        System.out.println(a.firstLast6(new int[] {1, 2, 6}));
        System.out.println(a.firstLast6(new int[] {6, 1, 2, 3}));
        System.out.println(a.firstLast6(new int[]{13, 6, 1, 2, 3}));
        System.out.println(a.sameFirstLast(new int[]{1, 2, 3}));
        System.out.println(a.sameFirstLast(new int[]{1, 2, 3, 1}));
        System.out.println(a.sameFirstLast(new int[]{1, 2, 1}));
        System.out.println(Arrays.toString(a.makePi()));
        System.out.println(a.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
        System.out.println(a.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3, 2}));
        System.out.println(a.commonEnd(new int[]{1, 2, 3}, new int[]{1, 3}));
        System.out.println(a.sum3(new int[]{1, 2, 3}));
        System.out.println(a.sum3(new int[]{7, 0, 0}));
        System.out.println(a.sum3(new int[]{5, 11, 2}));
        System.out.println(Arrays.toString(a.rotateLeft3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(a.reverse3(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(a.maxEnd3(new int[]{2, 11, 3})));
        System.out.println(Arrays.toString(a.max1End3(new int[]{11, 5, 9})));
        System.out.println(a.sum2(new int[]{1, 2, 3}));
        System.out.println(Arrays.toString(a.middleWay(new int[]{1, 2, 3}, new int[]{4, 5, 6})));
        System.out.println(Arrays.toString(a.makeEnds(new int[]{1, 2, 3})));
        System.out.println(a.has23(new int[]{2, 5}));
        System.out.println(a.no23(new int[]{2, 5}));
        System.out.println(Arrays.toString(a.makeLast(new int[]{2, 5})));
        System.out.println(a.double23(new int[]{2, 3}));
        System.out.println(Arrays.toString(a.fix23(new int[]{2, 3, 5})));
        System.out.println(a.start1(new int[]{1, 2, 3}, new int[]{}));
        System.out.println(Arrays.toString(a.biggerTwo(new int[]{1, 2, 3}, new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(a.makeMiddle(new int[]{1, 2})));
        System.out.println(Arrays.toString(a.plusTwo(new int[]{1, 2,}, new int[]{3, 4})));
        System.out.println(Arrays.toString(a.swapEnds(new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(a.midThree(new int[]{1, 2, 3, 4, 5})));
        System.out.println(a.maxTriple(new int[]{1, 5, 3}));
        System.out.println(Arrays.toString(a.frontPiece(new int[]{1, 5, 3})));
        System.out.println(a.unlucky1(new int[]{1, 3}));
        System.out.println(Arrays.toString(a.make2(new int[]{1}, new int[]{3, 4})));
        System.out.println(Arrays.toString(a.front11(new int[]{}, new int[]{3, 4})));






    }
}
