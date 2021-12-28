package javamaster.synchoranization;

public class ATM
    {


    synchronized public void checkBalance(String name)
        {
        System.out.print(name + " is checking");
        try
            {
            Thread.sleep(1000);
            } catch (InterruptedException e)
            {
            System.out.println(e);
            }
        System.out.println(" It's balance");
        }

    synchronized public void withdraw(String name, int amount)
        {
        System.out.print(name + " is withdrawing ");
        try
            {
            Thread.sleep(1000);
            } catch (InterruptedException e)
            {
            System.out.println(e);
            }
        System.out.println(amount);
        }
    }


