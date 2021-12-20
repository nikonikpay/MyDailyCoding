package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class CustomerApp {

//    public static void main(String[] args) throws Exception {
//
//        Customer[] myCustomers = {new Customer("Ali", "758458855"), new Customer("Micheal", "2154444"), new Customer("Kamal", "201356211")};
//
//        FileOutputStream fos = new FileOutputStream("Customer.txt");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//        oos.writeInt(myCustomers.length);
//        for (Customer customer : myCustomers) {
//            oos.writeObject(customer);
//
//        }
//        oos.close();
//        fos.close();
//    }

    public static void main(String[] args) throws Exception{

        Scanner scanner = new Scanner(System.in);
        FileInputStream myCustomerIn = new FileInputStream("Customer.txt");
        ObjectInputStream objInput = new ObjectInputStream(myCustomerIn);

        int length = objInput.readInt();
        Customer[] myCustomers = new Customer[length];
        for(int i =0; i< length; i++){
           myCustomers[i] =(Customer) objInput.readObject();
        }

        System.out.println("Enter name of Customer");
        String name = scanner.nextLine();
        for (int i=0;i<length;i++){
            if (name.equalsIgnoreCase(myCustomers[i].customerName))
                System.out.println(myCustomers[i]);
        }
    }


}
