package accountmanager;

import java.io.Serializable;

public class Account implements Serializable
{
    String accountNumber;
    String name;
    double balance;


    public Account(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public String toString()
    {
        return "Account No:"+accountNumber+"\nName :"+name+"\nBalance :"+balance+"\n";
    }



}
