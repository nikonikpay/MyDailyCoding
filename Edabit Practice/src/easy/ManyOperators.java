package easy;
/*
Some basic arithmetic operators are +, -, *, /, and %. In this challenge you will be given three parameters, num1, num2, and an operator. Use the operator on number 1 and 2.

Examples
operate(1, 2, "+") ➞ 3
// 1 + 2 = 3

operate(7, 10, "-") ➞ -3
// 7 - 10 = -3

operate(20, 10, "%") ➞ 0
// 20 % 10 = 0

 */

import org.jetbrains.annotations.NotNull;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ManyOperators {

    public static void main(String[] args) {

        System.out.println(operators(20,"+",12));

    }

    public static int operators(int firstNumber, String operand, int secondNumber) {

        int result = 0;
        switch (operand) {
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                if (firstNumber == 0 || secondNumber == 0) {
                    result = 0;
                } else {
                    result = firstNumber / secondNumber;
                }
                break;

            case "%":
                result= firstNumber%secondNumber;

        }
        return result;

    }

    // Second solution

    public static int operate2(int a, int b, String op) {
        try {
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("JS");
            return (int)engine.eval(a + " " + op + " " + b);
        } catch (ScriptException e) {
            return -1;
        }
    }

    // Third solution
    public static int operate3(int a, int b, String o) {
        return o.equals("+")?a+b:o.equals("-")?a-b:o.equals("*")?a*b:o.equals("/")?a/b:a%b;
    }

    //fourth solution
    public static int operate4(int a, int b, String op) {
        if (op=="-" && b<0) {
            op="+";
            b=Math.abs(b);
        }
        String evalString=Integer.toString(a)+op+Integer.toString(b);
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        try {
            Object result = engine.eval(evalString);
            return Integer.valueOf(result.toString());
        } catch (ScriptException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
