package opdracht.nineteen.four;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class LastPart {

    public static void main(String[] args) {

        IntStream myRandomNumber = new Random().ints(0,1000)
                .distinct()
                .filter(e->e%2==0)
                .limit(500);


       int[] finalNumbers = myRandomNumber

                .sorted()
                .toArray();

        System.out.println(Arrays.toString(finalNumbers));

















    }
}
