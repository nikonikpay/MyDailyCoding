package opdracht.twalf.one;

import java.util.Scanner;

public class WrappersApp {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);


        if(keyboard.hasNextInt()){
            String input = keyboard.next();


            System.out.println("The integer value of your input is :"+ Integer.valueOf(input));
            System.out.println("The bit value os your input is :" + Integer.bitCount(Integer.parseInt(input)));
            System.out.println("The byte value of your input is :" + Integer.valueOf(input).byteValue());
        } else{
            System.out.println("Try again. this time just press numbers");
        }




    }


}
