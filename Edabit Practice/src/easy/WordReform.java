package easy;

import java.util.StringJoiner;
import java.util.stream.Stream;

/**
 * A word has been split into a left part and a right part. Re-form the word by adding both halves together, changing the first character to an uppercase letter.
 *
 * Examples
 * getWord("seas", "onal") ➞ "Seasonal"
 *
 * getWord("comp", "lete") ➞ "Complete"
 *
 * getWord("lang", "uage") ➞ "Language"
 */

public class WordReform {
    public static void main(String[] args) {
        System.out.println(reform("Piko","age"));
    }

    public static String reform(String a, String b){


         StringJoiner newStr = new StringJoiner("");
         newStr.add(a).add(b);
         String desire = newStr.toString();
         return desire;


    }

    // second solution
    public static String getWord(String left, String right) {
        return left.substring(0,1).toUpperCase() + left.substring(1) + right;
    }
}
