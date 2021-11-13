package opdracht.twalf.six;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.chrono.ChronoPeriod;
import java.time.temporal.ChronoUnit;

public class BirthdayApp {

    public static void main(String[] args) {

        LocalDate nowDate = LocalDate.now();
        LocalDate myBirthday = LocalDate.of(1987, 5, 12);


        period(myBirthday, nowDate);
        totalDay(myBirthday, nowDate);
        totalWeek(myBirthday,nowDate);
        totalMonth(myBirthday, nowDate);
        totalYear(myBirthday, nowDate);

    }

    public static void period(LocalDate myBirthday, LocalDate now) {
        Period period = Period.between(myBirthday, now);
        System.out.println("I am : " + period.getYears() + " years and " + period.getMonths() + " Month and " + period.getDays() + " Days");

    }

    public static void totalDay(LocalDate myBirthday, LocalDate now) {
        System.out.println("Until Now i lived " + ChronoUnit.DAYS.between(myBirthday, now) + " Days");
    }

    public static void totalWeek(LocalDate myBirthday,LocalDate now){
        System.out.println("Until Now i lived " + ChronoUnit.WEEKS.between(myBirthday, now) + " Weeks");
    }

    public static void totalMonth(LocalDate myBirthday, LocalDate now) {
        System.out.println("Until Now i lived " + ChronoUnit.MONTHS.between(myBirthday, now) + " Month");
    }

    public static void totalYear(LocalDate myBirthday, LocalDate now) {
        System.out.println("Until Now i lived " + ChronoUnit.YEARS.between(myBirthday, now) + " Years");
    }

}
