package veryEasy;

public class SecondOne {
    /*
    Write a function that takes an integer minutes and converts it to seconds.

Examples
convert(5) ➞ 300

convert(3) ➞ 180

convert(2) ➞ 120
     */
    public static void main(String[] args) {
        System.out.println(minToSec(0));
    }

    public static int minToSec(int minutes){
        if(minutes<=0) {
          return  -1;



        }
        return minutes*60;
    }
}
