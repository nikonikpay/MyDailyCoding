package accountmanager;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class AccountApp
{
    static private Scanner scanner = new Scanner(System.in);
    static private Account acc = null;
    static private HashMap<String, Account> accountMap = new HashMap<String, Account>();
    static private FileOutputStream fileOutputStream;
    static private ObjectOutputStream objectOutputStream;


    public static void main(String[] args) throws Exception {

        try
        {
            FileInputStream fileInput = new FileInputStream("MyObject.txt");
            ObjectInputStream objInput = new ObjectInputStream(fileInput);

            int count = objInput.readInt();
            for (int i = 0; i < count; i++) {
                acc = (Account) objInput.readObject();
                System.out.println(acc);
                accountMap.put(acc.accountNumber, acc);
            }
            fileInput.close();
            objInput.close();
        }
        catch (Exception e)
        {

        }
        fileOutputStream = new FileOutputStream("MyObject.txt");
        objectOutputStream = new ObjectOutputStream(fileOutputStream);

        System.out.println(" Menu ");

        int choice;
        do {
            printMessage();
            choice = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            switchOptions(choice);
        } while (choice != 6);
        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();
    }


    private static void printMessage() {
        System.out.println("1. Create Account");
        System.out.println("2. Delete Account");
        System.out.println("3. View Account");
        System.out.println("4. View  All Accounts");
        System.out.println("5. Save Accounts");
        System.out.println("6. Exit");
        System.out.println("Enter your choice ");
    }

    private static void switchOptions(int choice) throws Exception {
        String accountNumber;
        String name;
        double balance;
        switch(choice)
        {
            case 1: System.out.println("Enter Details Accno, Name ,balance ");
                accountNumber=scanner.nextLine();
                name=scanner.nextLine();
                balance=scanner.nextDouble();
                acc=new Account(accountNumber,name,balance);
                accountMap.put(accountNumber, acc);
                System.out.println("Account Created for "+name);
                break;
            case 2: System.out.println("Enter Accno");
                accountNumber=scanner.nextLine();
                accountMap.remove(accountNumber);
                break;
            case 3: System.out.println("Enter Accno");
                accountNumber=scanner.nextLine();
                acc=accountMap.get(accountNumber);
                System.out.println(acc);
                break;
            case 4:
                for(Account a:accountMap.values())
                    System.out.println(a);
                break;

            case 5:
            case 6: objectOutputStream.writeInt(accountMap.size());
                for(Account a:accountMap.values())
                    objectOutputStream.writeObject(a);

        }
    }
}
