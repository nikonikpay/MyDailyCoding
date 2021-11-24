package easy;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Create a function that takes three integer arguments (a, b, c) and returns the amount of integers which are of equal value.
 *
 * Examples
 * equal(3, 4, 3) ➞ 2
 *
 * equal(1, 1, 1) ➞ 3
 *
 * equal(3, 4, 1) ➞ 0
 */

public class EqualParameter {
    public static void main(String[] args) {

        System.out.println(equalNumber(23,21,20));

    }

    public static int equalNumber(int a,int b,int c){
        if ( a ==b && b==c && a==c){
            return 3;
        } else if ( a ==b || b==c || a==c){
            return 2;
        }else {
            return 0;
        }

    }

    //Second way
    public static int equal(int a, int b, int c) {
        HashSet<Integer> equals = new HashSet <Integer>();

        equals.add(a);
        equals.add(b);
        equals.add(c);

        if(equals.size() == 1){
            return 3;
        }else if(equals.size() == 2){
            return 2;
        }else{
            return 0;
        }
    }

    // Third way
    public static int equal3(int a, int b, int c) {
        int [] counts = new int[10];
        counts[a]++;
        counts[b]++;
        counts[c]++;
        Arrays.sort(counts);
        if(counts[9] > 1) return counts[9];
        else return 0;
    }
}
