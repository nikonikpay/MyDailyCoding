package opdracht.nineteen.four;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class LastPart {

    public static void main(String[] args) {
        IntStream myRandomNumber = new Random().ints(500,0,1000);

       int[] finalNumbers = myRandomNumber
                .distinct()
                .filter(e->e%2==0)
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(finalNumbers));

















    }
}
