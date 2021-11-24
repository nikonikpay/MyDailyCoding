package easy;

/*
Write a function that returns true if there exists at least one number that is larger than or equal to n.

Examples
existsHigher([5, 3, 15, 22, 4], 10) ➞ true

existsHigher([1, 2, 3, 4, 5], 8) ➞ false

existsHigher([4, 3, 3, 3, 2, 2, 2], 4) ➞ true

existsHigher([], 5) ➞ false
 */

public class HigherNumber {

    public static void main(String[] args) {
        int[] myArray ={};

        System.out.println(isNumberHigher(myArray,10)); ;
    }

    public static boolean isNumberHigher(int[] arrayOfInt, int num) {
        boolean found = false;

        for(int i = 0; i < arrayOfInt.length; i++) {
            if(arrayOfInt[i]>=num) {
                found=true;
            }
        }
        return found;

    }

}
