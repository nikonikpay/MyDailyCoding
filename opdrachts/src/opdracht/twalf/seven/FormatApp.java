package opdracht.twalf.seven;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FormatApp {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Enter date in the format dd/MM/yyyy: ");
        String date = scan.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(formatter.format(localDate));
        System.out.println(localDate);






    }



}
