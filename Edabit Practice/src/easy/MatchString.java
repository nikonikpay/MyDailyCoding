package easy;

public class MatchString {
    /*
    Create a function that takes two strings and returns true if the first string ends with the second string; otherwise return false.

    Examples
    checkEnding("abc", "bc") ➞ true

    checkEnding("abc", "d") ➞ false

    checkEnding("samurai", "zi") ➞ false

    checkEnding("feminine", "nine") ➞ true

    checkEnding("convention", "tio") ➞ false

   */

    public static void main(String[] args) {
        System.out.println(checkTheEnd("Hi dear hasan","das n     "));;
    }

    public static boolean checkTheEnd(String s1, String s2){
        if (s1  == null && s2 == null || s1.isEmpty()&& s2.isEmpty()) {
            return false;
        }

        s1 = s1.trim();
        s2 = s2.trim();
        int lastChar1 = s1.charAt(s1.length()-1);
        int lastChar2 = s2.charAt(s2.length()-1);

        if ( lastChar1== lastChar2){
            return true;
        }else {
            return false;
        }

    }

}
