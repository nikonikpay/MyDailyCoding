package javamaster.exceptionexercise;

public class ExceptionApp
    {

    public static void main(String[] args)
        {
        Stack myStack = new Stack(5);
        try
            {
            myStack.push(10);
            myStack.push(15);
            myStack.push(10);
            myStack.push(15);
            myStack.push(10);
//            myStack.push(15);
            } catch (StackOverFlow s)
            {
            System.out.println(s);
            }

        }


    }
