package javamaster.serialization;

import java.io.Serializable;

public class Customer implements Serializable {
    String customerId;
    String customerName;
    String customerPhoto;

    static int count =0;

    public Customer(){ }
    public Customer(String customerName, String  customerPhoto){
        customerId = "C"+ count;
        count++;
        this.customerName = customerName;
        this.customerPhoto = customerPhoto;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerPhoto='" + customerPhoto + '\'' +
                '}';
    }
}
