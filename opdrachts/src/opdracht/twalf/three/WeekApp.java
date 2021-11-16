package opdracht.twalf.three;

import java.time.DayOfWeek;
import java.util.Scanner;

public class WeekApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean valid;


        System.out.println("Please enter a number between 1-7");
        int numberOfDay = sc.nextInt();
        valid = numberOfDay >= 1 && numberOfDay < 8;

        if (!valid){
            System.out.println("Can not add to day");
            return;
        }
        DayOfWeek dayOfWeek = DayOfWeek.of(numberOfDay);
        System.out.println("dayOfWeek is : " + dayOfWeek);
        System.out.println("Please enter a number to add to this day :");
        int dayPlus = sc.nextInt();
        if (!(dayPlus>0)){
            System.out.println("Can not add to day");
            return;
        }
        DayOfWeek daySummed = dayOfWeek.plus(dayPlus);
        System.out.println("Day of week after adding :"+dayPlus +"  days is : "+daySummed);



//        if(valid){
//            DayOfWeek dayOfWeek = DayOfWeek.of(numberOfDay);
//            System.out.println("dayOfWeek is : " + dayOfWeek);
//            System.out.println("Please enter a number to add to this day :");
//            int dayPlus = sc.nextInt();
//            if (dayPlus>0){
//                DayOfWeek daySummed = dayOfWeek.plus(dayPlus);
//                System.out.println("Day of week after adding :"+dayPlus +"  days is : "+daySummed);
//            }else{
//                System.out.println("Can not add to day");
//            }
//
//        } else{
//            System.out.println("enter valid number");
//        }

    }


}
