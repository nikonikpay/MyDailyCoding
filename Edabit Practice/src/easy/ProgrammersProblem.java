package easy;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * You hired three programmers and you (hopefully) pay them. Create a function that takes three numbers (the hourly wages of each programmer) and returns the difference between the highest-paid programmer and the lowest-paid.
 *
 * Examples
 * programmers(147, 33, 526) ➞ 493
 *
 * programmers(33, 72, 74) ➞ 41
 *
 * programmers(1, 5, 9) ➞ 8
 */

public class ProgrammersProblem {

    public static void main(String[] args) {
        System.out.println(salaryDifference(20,920,180));

    }

    public static int salaryDifference(int a,int b, int c){

        int[] myArray ={a,b,c};
        Arrays.sort(myArray);
         return myArray[myArray.length-1]-myArray[0];

    }
}
