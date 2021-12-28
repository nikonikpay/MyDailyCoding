package javamaster.synchoranization;

public class AtmApp
    {
    public static void main(String[] args)
        {
        ATM myAtm = new ATM();
        Customer customer1= new Customer(myAtm,"Ali",250);
        Customer customer2 = new Customer(myAtm," Kim",3600);



        customer1.start();
        customer2.start();
        }




    }
