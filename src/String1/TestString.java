package String1;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 7/10/13
 * Time: 7:48 PM
 */
public class TestString {
    public static void main(String[] args) {
        String1 test = new String1();

        System.out.println(test.helloName("X"));
        System.out.println(test.makeAbba("What", "Up"));
        System.out.println(test.makeTags("i", "Yay"));
        System.out.println(test.makeOutWord("[[]]", "word"));
        System.out.println(test.extraEnd("word"));
        System.out.println(test.firstTwo("w"));
        System.out.println(test.firstHalf("word"));
        System.out.println(test.withoutEnd("word"));
        System.out.println(test.comboString("hi", "Hello"));
        System.out.println(test.nonStart("hi", "Hello"));
        System.out.println(test.left2("hello"));
        System.out.println(test.right2("java"));
        System.out.println(test.theEnd("Hello", false));
        System.out.println(test.withouEnd2("java"));
        System.out.println(test.middleTwo("java"));
        System.out.println(test.endsLy("ly"));
        System.out.println(test.nTwice("Chocolate", 3));
        System.out.println(test.twoChar("java", 0));
        System.out.println(test.middleThree("solving"));
        System.out.println(test.hasBad("badxx"));
        System.out.println(test.atFirst(""));
        System.out.println(test.lastChars("", ""));
        System.out.println(test.conCat("c", "cat"));
        System.out.println(test.lastTwo("coding"));

    }


}
