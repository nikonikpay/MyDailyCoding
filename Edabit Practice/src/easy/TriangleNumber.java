package easy;

/*
This Triangular Number Sequence is generated from a pattern of dots that form a triangle. The first 5 numbers of the sequence, or dots, are:

1, 3, 6, 10, 15
This means that the first triangle has just one dot, the second one has three dots, the third one has 6 dots and so on.

Write a function that returns the number of dots when given its corresponding triangle number of the sequence.

Examples
triangle(1) ➞ 1

triangle(6) ➞ 21

triangle(215) ➞ 23220
 */

public class TriangleNumber {
    public static void main(String[] args) {

        System.out.println(triangleSequence(3));

        System.out.println("the second way "+ triangleSequence2(0));

    }

    public static int triangleSequence(int x) {
        if (x < 1) {
            return -1;
        }
        int numberofDots = x * (x + 1) / 2;
        return numberofDots;

    }

    public static int triangleSequence2(int x){

        if (x<1){
            System.out.println("Number is not valid");
            return -1;
        }
        int numberOfDots =0;
        for (int i =0;i<=x;i++){
            numberOfDots +=i;

        }
        return numberOfDots;

    }

}


