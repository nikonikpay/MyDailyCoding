package opdracht.twalf.five;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneApp {

    public static void main(String[] args) {

        ZoneId brusselZone = ZoneId.of("Europe/Brussels");
        ZoneId londonZone = ZoneId.of("Europe/London");
        ZoneId sydneyZone = ZoneId.of("Australia/Sydney");
        ZoneId adelideZone = ZoneId.of("Australia/Adelaide");
        ZoneId utc4 = ZoneOffset.UTC;

        ZonedDateTime sintNiklaas = ZonedDateTime.now(brusselZone);
        ZonedDateTime nowLondon = ZonedDateTime.now(londonZone);
        ZonedDateTime nowSydney = ZonedDateTime.now(sydneyZone);
        ZonedDateTime nowAdelaide = ZonedDateTime.now(adelideZone);
        ZonedDateTime utc_4 = ZonedDateTime.now(utc4).minusHours(4);


        System.out.println(sintNiklaas);
        System.out.println(nowLondon);
        System.out.println(nowSydney);
        System.out.println(nowAdelaide);
        System.out.println(utc_4);
    }
}
