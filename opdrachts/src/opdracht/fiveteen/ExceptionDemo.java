package opdracht.fiveteen;

import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {


        int i =0;
        do {
            try{
                Scanner sc = new Scanner(System.in);
                i = sc.nextInt();

                break;
            }
            catch (Exception e){
                System.out.println("Invalid Value");
            }
        }while (true);

        System.out.println(String.format("The number you have given was %d",i));
    }

}
