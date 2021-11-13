package opdracht.twalf.two;

import java.time.Instant;

public class InstantApp {
    public static void main(String[] args) {

        Instant instance = Instant.now();


        Instant addSecond = instance.plusSeconds(7);
        Instant addMilliSec = addSecond.plusMillis(5);
        Instant addNanoSec = addMilliSec.plusNanos(3);



        System.out.println("The  current  time is\n "+ instance+"\nAnd the rest is \n" +addNanoSec);

    }

}
