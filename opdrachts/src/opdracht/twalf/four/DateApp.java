package opdracht.twalf.four;

import java.time.LocalDate;

public class DateApp {
    public static void main(String[] args) {
        LocalDate myBirthday = LocalDate.of(1987,5,12);

        System.out.println(myBirthday.getDayOfYear());
        System.out.println(myBirthday.getMonth());
        System.out.println(myBirthday.getDayOfWeek());
        int myYear = myBirthday.getYear();

        if (((myYear % 4 == 0) && (myYear % 100!= 0)) || (myYear%400 == 0)){
            System.out.println(myYear + " is a leap year");
        }else {
            System.out.println(myYear + " is not a leap year");
        }


    }

}
