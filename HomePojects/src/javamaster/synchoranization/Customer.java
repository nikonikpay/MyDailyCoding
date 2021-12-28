package javamaster.synchoranization;

public class Customer extends Thread
    {

    ATM atm;
    String name;
    int amount;


    public Customer(ATM atm, String name, int amount)
        {
        this.atm = atm;
        this.name = name;
        this.amount = amount;
        }

    @Override
    public void run()
        {
       useAtm();
        }


    public void useAtm()
        {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
        }

    }
