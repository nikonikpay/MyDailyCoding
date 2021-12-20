package opdracht.nineteen.four;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Part2 {
    public static void main(String[] args) {

        double sumOfRoot = IntStream.range(0,1000)
                .filter(e-> e%8==0 && e%5==0)
                .mapToDouble(Math::sqrt)
                .sum();

        System.out.println(sumOfRoot);







    }


}
