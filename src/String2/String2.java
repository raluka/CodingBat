package String2;

/*
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 7/18/13
 * Time: 9:15 PM
 * Medium String problems -- 1 loop.
 */

public class String2 {

    /*
    Given a string, return a string where for every char in the original, there are two chars.

doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
     */

    public String doubleChar(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result = result + str.charAt(i) + str.charAt(i);
        }
        return result;
    }

    /*
    Return the number of times that the string "hi" appears anywhere in the given string.

countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
     */

    public int countHi(String str) {
/*
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.regionMatches(i, "hi", 0, 2)) {
                count++;
            }
        }
        return count;
*/
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++){
            if (str.substring(i,i+2).equals("hi")) count++;
        }
        return count;
    }

    /*
    Return true if the string "cat" and "dog" appear the same number of times in the given string.

catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true
     */

    public boolean catDog(String str) {
        int count = 0;
        if (str.length() >= 3) {
            for (int i = 0; i <= str.length() - 3; i++) {
                if (str.substring(i, i + 3).equals("cat")) count++;
                if (str.substring(i, i + 3).equals("dog")) count--;
            }
        }
        return (count == 0);
    }

    /*
    Return the number of times that the string "code" appears anywhere in the given string, except we'll accept any
    letter for the 'd', so "cope" and "cooe" count.

countCode("aaacodebbb") → 1
countCode("codexxcode") → 2
countCode("cozexxcope") → 2
     */

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.substring(i, i + 4).endsWith("e")) {
                count++;
            }
        }
        return count;
    }

    /*
    Given two strings, return true if either of the strings appears at the very end of the other string, ignoring
    upper/lower case differences (in other words, the computation should not be "case sensitive").
    Note: str.toLowerCase() returns the lowercase version of a string.

endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
     */

    public boolean endOther(String a, String b) {
/*
        int sizeA = a.length();
        int sizeB = b.length();
        if (sizeA <= sizeB && b.regionMatches(true, (sizeA - 1), a, 0, sizeA)) return true;
        if (sizeB < sizeA && a.regionMatches(true, (sizeB - 1), b, 0, sizeB)) return true;
        return false;
*/
        int sizeA = a.length();
        int sizeB = b.length();
        a = a.toLowerCase();
        b = b.toLowerCase();
        return (sizeA <= sizeB && b.endsWith(a)) || (sizeA > sizeB && a.endsWith(b));
    }

    /*
    Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period
    (.). So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
     */

    public boolean xyzThere(String str) {
        int count = 0;
        if (str.length() >= 4 && str.contains(".xyz")) str = str.replace(".xyz","a");
        if (str.length() >= 3 && str.contains("xyz")) count++;
        return (count >0);
    }

    /*
    Return true if the given string contains a "bob" string, but where the middle 'o' char can be any char.

bobThere("abcbob") → true
bobThere("b9b") → true
bobThere("bac") → false
     */

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.length() >= 3 && str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') return true;
        }
        return false;
    }

    /*
    We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere
    later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return true if the
    given string is xy-balanced.
     */

    public boolean xyBalance(String str) {
/*
        int count = 0;
        for (int i = 0; i <= str.length()-1; i++) {
            if (str.charAt(i) == 'x') {
                count++;
                if (str.substring(i+1).contains("y") && !str.substring(i+1).contains("x")) count = 0;
            }
        }
        return (count == 0);
*/
        return  (str.lastIndexOf('y') >= str.lastIndexOf('x')) ;
    }

    /*
    Given two strings, A and B, create a bigger string made of the first char of A, the first char of B, the second
    char of A, the second char of B, and so on. Any leftover chars go at the end of the result.

mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"
     */

    public String mixString(String a, String b) {
        int minSize = Math.min(a.length(), b.length());
        String result = "";
        for (int i = 0; i < minSize; i++) {
            result = result + a.charAt(i) + b.charAt(i);
        }
        return result + a.substring(minSize) + b.substring(minSize);
    }

    /*
    Given a string and an int N, return a string made of N repetitions of the last N characters of the string. You may
     assume that N is between 0 and the length of the string, inclusive.

repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"
     */

    public String repeatEnd(String str, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += str.substring(str.length() - n);
        }
        return result;
    }

    /*
   Given a string and an int n, return a string made of the first n characters of the string, followed by the first n-1
   characters of the string, and so on. You may assume that n is between 0 and the length of the string, inclusive
   (i.e. n >= 0 and n <= str.length()).

repeatFront("Chocolate", 4) → "ChocChoChC"
repeatFront("Chocolate", 3) → "ChoChC"
repeatFront("Ice Cream", 2) → "IcI"
     */
    public String repeatFront(String str, int n) {
        String result = "";
        for (int i = n; i >= 0; i--) {
            result += str.substring(0, i);
        }
        return result;
    }

    /*
    Given two strings, word and a separator, return a big string made of count occurences of the word, separated by the
     separator string.

repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"
     */

    public String repeatSeparator(String word, String sep, int count) {
        String result = word;
        for (int i = 1; i < count; i++) {
            result = result + sep + word;
        }
        if (count == 0) result = "";
        return result;
    }

    /*
    Given a string, consider the prefix string made of the first N chars of the string. Does that prefix string appear
    somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().

prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
     */

    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        return (str.substring(n).contains(prefix));
    }

    /*
    Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that the number of chars
    to the left and right of the "xyz" must differ by at most one. This problem is harder than it looks.

xyzMiddle("AAxyzBB") → true
xyzMiddle("AxyzBB") → true
xyzMiddle("AxyzBBB") → false
     */

    public boolean xyzMiddle(String str) {
        String front;
        String back;
        if (str.length() > 2 && str.contains("xyz")) {
            for (int i = str.indexOf("xyz"); i <= str.lastIndexOf("xyz"); i++) {
                front = str.substring(0, str.indexOf("xyz"));
                back = str.substring(str.indexOf("xyz") + 3);
                if (Math.abs(front.length() - back.length()) <= 1) return true;
                str = str.replaceFirst("xyz", "abc");
            }
        }
        return false;
    }

    /*
    A sandwich is two pieces of bread with something in between. Return the string that is between the first and last
    appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread.

getSandwich("breadjambread") → "jam"
getSandwich("xxbreadjambreadyy") → "jam"
getSandwich("xxbreadyy") → ""
     */

    public String getSandwich(String str) {
        if (str.indexOf("bread")== str.lastIndexOf("bread")) return "";
        return str.substring(str.indexOf("bread")+5,str.lastIndexOf("bread"));
    }

    /*
    Returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star,
    they are the same.

sameStarChar("xy*yzz") → true
sameStarChar("xy*zzz") → false
sameStarChar("*xa*az") → true
     */

    public boolean sameStarChar(String str) {
        int count = 0;
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i - 1) != str.charAt(i + 1) && str.charAt(i) == '*') count--;
        }
        return (count >= 0);
    }

    /*
    Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a
    string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".

zipZap("zipXzap") → "zpXzp"
zipZap("zopzop") → "zpzp"
zipZap("zzzopzop") → "zzzpzp"
     */
    public String zipZap(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
                str = str.substring(0, i + 1) + str.substring(i + 2);
            }
        }
        return str;
    }

    /*
    Return a version of the given string, where for every star (*) in the string the star and the chars immediately to
    its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also yields "ad".

starOut("ab*cd") → "ad"
starOut("ab**cd") → "ad"
starOut("sm*eilly") → "silly"
     */

    public String starOut(String str) {
        String result = "";
        if (str.length() > 0) {
            for (int i = 0; i < str.length() - 1; i++) {
                if (str.charAt(i) != '*') {
                    result += str.charAt(i + 1);
                }
            }
            str = str.charAt(0) + result;
            result = "";
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) != '*') {
                    result += str.charAt(i - 1);
                }
            }
            str = result + str.charAt(str.length() - 1);
            result = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != '*') {
                    result += str.charAt(i);
                }
            }
        }
        return result;
    }






































}
