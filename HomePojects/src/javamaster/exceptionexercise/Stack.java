package javamaster.exceptionexercise;

public class Stack
    {
    private int size;
    private int top = -1;
    private int[] S;


    public Stack(int size)
        {
        this.size = size;
        this.S = new int[size];
        }

    public void push(int x) throws StackOverFlow
        {
        if (top == size - 1)
            {
            throw new StackOverFlow();
            }
        top++;
        S[top] = x;
        }

    public int pop() throws StackUnderFlow
        {
        int x = -1;
        if (top == -1)
            {
            throw new StackUnderFlow();
            }
        x = S[top];
        top--;
        return x;

        }
    }
