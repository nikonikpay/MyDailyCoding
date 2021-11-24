package easy;
/*
Given a total due and an array representing the amount of change in your pocket, determine whether or not you are able to pay for the item. Change will always be represented in the following order: quarters, dimes, nickels, pennies.

To illustrate: changeEnough([25, 20, 5, 0], 4.25) should yield true, since having 25 quarters, 20 dimes, 5 nickels and 0 pennies gives you 6.25 + 2 + .25 + 0 = 8.50.

Examples
changeEnough([2, 100, 0, 0], 14.11) ➞ false

changeEnough([0, 0, 20, 5], 0.75) ➞ true

changeEnough([30, 40, 20, 5], 12.55) ➞ true

changeEnough([10, 0, 0, 50], 3.85) ➞ false

changeEnough([1, 0, 5, 219], 19.99) ➞ false
 */

import java.util.stream.IntStream;

public class ConvenienceStore {
    public static void main(String[] args) {
        int[] myMoney = {25,20,5,0};
        System.out.println(changeEnough(myMoney,4.25));

    }

    public static boolean changeEnough(int[] change, double amountDue) {
        System.out.println(change[0]);
        return change[0] * 25 + change[1] * 10 + change[2] * 5 + change[3] >= amountDue * 100;

    }

    // second solution
    public static boolean changeEnough2(int[] change, double amountDue) {
        //quarter: 25 cents / $0.25
        //dime: 10 cents / $0.10
        //nickel: 5 cents / $0.05
        //penny: 1 cent / $0.01


        double[] value = new double[] {0.25, 0.10, 0.05, 0.01};

        boolean result = IntStream.range(0, change.length).mapToDouble(i -> change[i] * value[i]).sum() >= amountDue;
        System.out.println(result);

        return result;
    }

    // third solution
    public static boolean changeEnough3(int[] change, double amountDue) {
        double quarter, dime, nickle, pennie, total;
        quarter = change[0] * 0.25;
        dime = change[1] * 0.10;
        nickle = change[2] *0.05;
        pennie = change[3] *0.01;
        total = quarter + dime + nickle + pennie;
        if (total >= amountDue)
            return true;
        else
            return false;
    }
}
