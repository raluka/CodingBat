package String2;

/*
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 7/18/13
 * Time: 9:15 PM
 * Medium String problems -- 1 loop test class
 */
public class TestString2 {
    public static void main(String[] args) {

        String2 tester = new String2();

        System.out.println(tester.doubleChar("The"));
        System.out.println(tester.doubleChar("AAbb"));
        System.out.println(tester.doubleChar("Hi-There"));
        System.out.println(tester.countHi("abc hi ho"));
        System.out.println(tester.countHi("ABChi hi"));
        System.out.println(tester.countHi("hihi"));
        System.out.println(tester.countHi("hihi"));
        System.out.println(tester.catDog("catdog"));
        System.out.println(tester.catDog("catxdogxdogxca"));
        System.out.println(tester.countCode("aaacodebbb"));
        System.out.println(tester.countCode("codexxcode"));
        System.out.println(tester.countCode("cozexxcope"));
        System.out.println(tester.endOther("Hiabc", "abc"));
        System.out.println(tester.xyzThere("abcxyz"));
        System.out.println(tester.xyzThere("abc.xyz"));
        System.out.println(tester.xyzThere("12xyz"));
        System.out.println(tester.bobThere("abcbob"));
        System.out.println(tester.bobThere("b9b"));
        System.out.println(tester.bobThere("bac"));
        System.out.println(tester.xyBalance("aaxbby"));
        System.out.println(tester.xyBalance("bbb"));
        System.out.println(tester.xyBalance("x"));
        System.out.println(tester.mixString("abc", "xyz"));
        System.out.println(tester.mixString("Hi", "There"));
        System.out.println(tester.repeatEnd("Hello", 3));
        System.out.println(tester.repeatEnd("Hello", 2));
        System.out.println(tester.repeatEnd("Hello", 1));
        System.out.println(tester.repeatFront("Chocolate", 4));
        System.out.println(tester.repeatFront("Chocolate", 3));
        System.out.println(tester.repeatFront("Ice Cream", 2));
        System.out.println(tester.repeatSeparator("Word", "X", 3));
        System.out.println(tester.repeatSeparator("This", "And", 2));
        System.out.println(tester.repeatSeparator("This", "And", 1));
        System.out.println(tester.prefixAgain("abXYabc", 1));
        System.out.println(tester.prefixAgain("abXYabc", 2));
        System.out.println(tester.prefixAgain("abXYabc", 3));
        System.out.println(tester.xyzMiddle("xyz"));
        System.out.println(tester.xyzMiddle("AxyzBB"));
        System.out.println(tester.xyzMiddle("AxyzxyzBB"));
        System.out.println(tester.getSandwich("breadjambread"));
        System.out.println(tester.getSandwich("xxbreadjambreadyy"));
        System.out.println(tester.getSandwich("xxbreadyy"));
        System.out.println(tester.sameStarChar("xy*yzz"));
        System.out.println(tester.sameStarChar("xy*zzz"));
        System.out.println(tester.sameStarChar("*xa*az"));
        System.out.println(tester.zipZap("zipXzap"));
        System.out.println(tester.zipZap("zopzop"));
        System.out.println(tester.zipZap("zzzopzop"));
        System.out.println(tester.starOut("ab*cd"));
        System.out.println(tester.starOut("ab*cd"));
        System.out.println(tester.starOut(""));








    }
}
