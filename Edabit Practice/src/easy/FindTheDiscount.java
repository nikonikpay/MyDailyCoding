package easy;
/*

Create a function that takes two arguments: the original price and the discount percentage as integers and returns the final price after the discount.

Alternative Text

Examples
discount(1500, 50) ➞ 750

discount(89, 20) ➞ 71.2

discount(100, 75) ➞ 25
 */

public class FindTheDiscount {
    public static void main(String[] args) {
        System.out.println(afterDiscount(1000,10));

    }

    public static double afterDiscount(double price,double discount){

        double discountAmount = (price*discount)/100;
        double finalAmount = price-discountAmount;
        return  finalAmount;
    }

}
