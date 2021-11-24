package easy;

/*
Create a function that takes two numbers and a mathematical operator + - / * and will perform a calculation with the given numbers.

Examples
calculator(2, '+', 2) ➞ 4

calculator(2, '*', 2) ➞ 4

calculator(4, '/', 2) ➞ 2
 */

public class BasicCalculator {

    public static void main(String[] args) {

        System.out.println(calculator(36, '/', 0));

    }

    public static int calculator(int firstNumber, char operand, int secondNumber) {

        int result = 0;
        switch (operand) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber + secondNumber;
                break;
            case '/':
                if (firstNumber == 0 || secondNumber == 0) {
                    result = 0;
                } else {
                    result = firstNumber / secondNumber;
                }
                break;

        }
        return result;

    }


}
