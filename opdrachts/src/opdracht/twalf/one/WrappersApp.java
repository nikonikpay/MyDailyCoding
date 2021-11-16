package opdracht.twalf.one;

import java.util.Scanner;

public class WrappersApp {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        if(keyboard.hasNextInt()){

            String input = keyboard.next();
            Integer intInput = Integer.parseInt(input);
            System.out.println("The integer value of your input is :"+ intInput);
            System.out.println("The bit value os your input is :" + Integer.bitCount(intInput));
            System.out.println("The byte value of your input is :" + intInput.byteValue());
        } else{
            System.out.println("Try again. this time just press numbers");
        }




    }


}
