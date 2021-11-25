package normal;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Create a function that takes two numbers as arguments (num, length) and returns an array of multiples of num until the array length reaches length.
 * <p>
 * Examples
 * arrayOfMultiples(7, 5) ➞ [7, 14, 21, 28, 35]
 * <p>
 * arrayOfMultiples(12, 10) ➞ [12, 24, 36, 48, 60, 72, 84, 96, 108, 120]
 * <p>
 * arrayOfMultiples(17, 6) ➞ [17, 34, 51, 68, 85, 102]
 */

public class MultipleArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(arrayOfInt(6, 5)));

    }

    public static int[] arrayOfInt(int num, int length) {
        int[] finalArray = new int[length];
        finalArray[0] = num;
        for (int i = 1; i < finalArray.length; i++) {
            finalArray[i] = num + finalArray[i - 1];

            System.out.println(finalArray[i]);

        }
        return finalArray;

    }


    //second Solution
    public static int[] arrayOfMultiples(int num, int length) {
        return IntStream.rangeClosed(1, length)
                .map(i -> num * i)
                .toArray();
    }

    //third solution
    public static int[] arrayOfMultiples2(int num, int length) {
        int[] mult = new int[length];
        for (int i = 0; i < length; i++) {
            mult[i] = num * (i + 1);
        }
        return mult;
    }

}
