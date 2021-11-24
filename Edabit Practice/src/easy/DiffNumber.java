package easy;
/**
 *
 * Create a function that takes an array and returns the difference between the biggest and smallest numbers.
 *
 * Examples
 * differenceMaxMin([10, 4, 1, 4, -10, -50, 32, 21]) ➞ 82
 * // Smallest number is -50, biggest is 32.
 *
 * differenceMaxMin([44, 32, 86, 19]) ➞ 67
 * // Smallest number is 19, biggest is 86.
 */

import java.util.Arrays;

public class DiffNumber {
    public static void main(String[] args) {

        int[] myArr = {25,65,3,98};
        System.out.println(differ(myArr));

    }

    public static int differ(int[] arr){
        // Initialize maximum element
        int max = arr[0];
        int min = arr [0];
        // Traverse array elements from second and
        // compare every element with current max
        for (int i = 1; i < arr.length; i++){
            if (arr[i] > max)
                max = arr[i];
        }

        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min)
                min = arr[i];
        }

        return max - min;

    }

    //Second Solution
    public static int differenceMaxMin(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1]-arr[0];
    }
}
